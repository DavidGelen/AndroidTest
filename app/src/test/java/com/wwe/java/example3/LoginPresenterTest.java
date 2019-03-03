package com.wwe.java.example3;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoRule;

import static org.junit.Assert.*;

/**
 * @name AndroidTest
 * @class name：com.wwe.java.example3
 * @class describe
 * @anthor David
 * @time 2019/1/31 3:30 PM
 * @class describe
 */
public class LoginPresenterTest {

    @Rule
    public MockitoRule mockitoRule = MockitoJUnit.rule();

    @Mock
    UserManager um;

    @Mock
    PasswordValidator pv;

    @InjectMocks
    LoginPresenter lp;

    @Before
    public void setUp() throws Exception {
        lp = new LoginPresenter();
    }

    @Test
    public void test() {
        lp.setUM(um);

        UserManager _um = lp.getUM();

        lp.login("zhangbiao", "123456");
        Mockito.verify(_um).performLogin("zhangbiao",
                "123456");
    }
}