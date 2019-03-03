

Mockito.mock(UserManager.class); <=> UserManager mUserManager = new UserManager();

使用Mockito，验证一个对象的方法调用情况的姿势是：

Mockito.verify(objectToVerify).methodToVerify(arguments);
其中，objectToVerify和methodToVerify分别是你想要验证的对象和方法。

---

//验证mockUserManager的performLogin得到了三次调用。
Mockito.verify(mockUserManager, Mockito.times(3)).performLogin(...);

---

//anyString()表示任何一个字符串都可以。null？也可以的！
Mockito.verify(mockUserManager).performLogin(Mockito.anyString(), Mockito.anyString());

---

Mockito.when(validator.verifyPassword(anyString())).thenReturn(true);

---

//any(clazz)表示任何属于clazz的对象

public void loginCallbackVersion(String username, String password) {
    if (username == null || username.length() == 0) return;
    //假设我们对密码强度有一定要求，使用一个专门的validator来验证密码的有效性
    if (mPasswordValidator.verifyPassword(password)) return;

    //login的结果将通过callback传递回来。
    mUserManager.performLogin(username, password, new NetworkCallback() {
        @Override
        public void onSuccess(Object data) {
            //update view with data
        }

        @Override
        public void onFailure(int code, String msg) {
            //show error msg
        }
    });
}

让mUserManager直接调用传入的NetworkCallback的onSuccess或onFailure方法。
这种指定mock对象执行特定的动作的写法如下：

Mockito.doAnswer(desiredAnswer).when(mockObject).targetMethod(args);
传给doAnswer()的是一个Answer对象，我们想要执行什么样的动作，就在这里面实现。结合上面的例子解释：

Mockito.doAnswer(new Answer() {
    @Override
    public Object answer(InvocationOnMock invocation) throws Throwable {
        //这里可以获得传给performLogin的参数
        Object[] arguments = invocation.getArguments();

        //callback是第三个参数
        NetworkCallback callback = (NetworkCallback) arguments[2];

        callback.onFailure(500, "Server error");
        return 500;
    }
}).when(mockUserManager).performLogin(anyString(), anyString(), any(NetworkCallback.class));

---

总之，spy与mock的唯一区别就是默认行为不一样：
spy对象的方法默认调用真实的逻辑，mock对象的方法默认什么都不做，或直接返回默认值。

---

其中@RunWith(RobolectricGradleTestRunner.class)表示用Robolectric的TestRunner来跑这些test
























