package cn.edu.gdmec.android.gsonweather.View;

import cn.edu.gdmec.android.gsonweather.WeatherBean;

/**
 * Created by apple on 18/5/15.
 */

public interface IWeatherView {
    void showProgress();
    void hideProgrss();
    void showWeatherData(WeatherBean weatherBean);
    void showLoadFailMsg(Exception e);
}
