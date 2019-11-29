/*
 * Copyright (C) 2019 FynnJason.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.github.mvpapp.mvp.view

import com.github.mvpapp.base.IBaseView
import com.github.mvpapp.bean.WeatherBean
import okhttp3.internal.http.RealResponseBody

/**
 * MainActivity的View接口
 */
interface IMainView : IBaseView {
    fun onSuccessWeather(t: WeatherBean,json: String)
    fun onErrorWeather(errorCode: Int, errorMsg: String)
}