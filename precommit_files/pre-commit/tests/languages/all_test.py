from __future__ import unicode_literals

import functools
import inspect

import pytest
import six

from pre_commit.languages.all import all_languages
from pre_commit.languages.all import languages


if six.PY2:  # pragma: no cover
    ArgSpec = functools.partial(
        inspect.ArgSpec, varargs=None, keywords=None, defaults=None,
    )
    getargspec = inspect.getargspec
else:  # pragma: no cover
    ArgSpec = functools.partial(
        inspect.FullArgSpec, varargs=None, varkw=None, defaults=None,
        kwonlyargs=[], kwonlydefaults=None, annotations={},
    )
    getargspec = inspect.getfullargspec


@pytest.mark.parametrize('language', all_languages)
def test_install_environment_argspec(language):
    expected_argspec = ArgSpec(
        args=['prefix', 'version', 'additional_dependencies'],
    )
    argspec = getargspec(languages[language].install_environment)
    assert argspec == expected_argspec


@pytest.mark.parametrize('language', all_languages)
def test_ENVIRONMENT_DIR(language):
    assert hasattr(languages[language], 'ENVIRONMENT_DIR')


@pytest.mark.parametrize('language', all_languages)
def test_run_hook_argpsec(language):
    expected_argspec = ArgSpec(args=['hook', 'file_args'])
    argspec = getargspec(languages[language].run_hook)
    assert argspec == expected_argspec


@pytest.mark.parametrize('language', all_languages)
def test_get_default_version_argspec(language):
    expected_argspec = ArgSpec(args=[])
    argspec = getargspec(languages[language].get_default_version)
    assert argspec == expected_argspec


@pytest.mark.parametrize('language', all_languages)
def test_healthy_argspec(language):
    expected_argspec = ArgSpec(args=['prefix', 'language_version'])
    argspec = getargspec(languages[language].healthy)
    assert argspec == expected_argspec
