import pytest


@pytest.fixture
def wallet():

    amount =0
    return amount

@pytest.mark.parametrize("earned, spent, expected", [ (30, 10, 20), (20, 2, 18), ])
def test_Money(wallet, earned, spent, expected):
    wallet +=(earned-spent)
    assert wallet == expected
