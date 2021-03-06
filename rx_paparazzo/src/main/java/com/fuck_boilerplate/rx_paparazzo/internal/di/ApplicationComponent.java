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

package com.fuck_boilerplate.rx_paparazzo.internal.di;

import com.fuck_boilerplate.rx_paparazzo.interactors.GetPath;
import com.fuck_boilerplate.rx_paparazzo.workers.Camera;
import com.fuck_boilerplate.rx_paparazzo.workers.Gallery;

public abstract class ApplicationComponent {

    public abstract Camera camera();

    public abstract Gallery gallery();

    public abstract GetPath getPath();

    public static ApplicationComponent create(final ApplicationModule applicationModule) {
        return new ApplicationComponentImpl(applicationModule.getUi(), applicationModule.getConfig());
    }
}
