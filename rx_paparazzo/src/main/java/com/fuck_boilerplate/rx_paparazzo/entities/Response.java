/*
 * Copyright 2016 FuckBoilerplate
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.fuck_boilerplate.rx_paparazzo.entities;

public class Response<T, D> {
    private final T targetUI;
    private final D data;
    private final int resultCode;

    public Response(T targetUI, D data, int resultCode) {
        this.targetUI = targetUI;
        this.data = data;
        this.resultCode = resultCode;
    }

    public T targetUI() {
        return targetUI;
    }

    public D data() {
        return data;
    }

    public int resultCode() {
        return resultCode;
    }
}
