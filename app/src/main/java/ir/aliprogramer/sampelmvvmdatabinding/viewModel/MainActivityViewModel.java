package ir.aliprogramer.sampelmvvmdatabinding.viewModel;
import ir.aliprogramer.sampelmvvmdatabinding.BR;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

public class MainActivityViewModel extends BaseObservable {
    @Bindable
    public String userName;
    @Bindable
    public String userNameError;
    @Bindable
    public String password;
    @Bindable
    public String passwordError;

    public MainActivityViewModel() {
        this.userName = "";
        this.password = "";
    }

    public boolean checkInput(){
        //clear message in view
        setUserNameError("");
        notifyPropertyChanged(BR.userNameError);
        setPasswordError("");
        notifyPropertyChanged(BR.passwordError);

        if (getUserName().isEmpty()) {
            setUserNameError("لطفا نام کاربری خود را وارد کنید.");
            notifyPropertyChanged(BR.userNameError);
        }
        if(getPassword().isEmpty()) {
            setPasswordError("لطفا رمز عبور خود را وارد کنید.");
            notifyPropertyChanged(BR.passwordError);
        }
        if(getUserName().isEmpty() || getPassword().isEmpty())
            return false;

        return true;
    }
    public void btnLogin() {
    if(!checkInput())
        return;

    }


    public void btnRegister() {

    }














    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserNameError() {
        return userNameError;
    }

    public void setUserNameError(String userNameError) {
        this.userNameError = userNameError;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPasswordError() {
        return passwordError;
    }

    public void setPasswordError(String passwordError) {
        this.passwordError = passwordError;
    }
}
