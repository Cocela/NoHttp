/*
 * Copyright © ${user}. All Rights Reserved
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.yolanda.nohttp.error;

/**
 * <p>Request connection timeout</p>
 * Created in 2016/2/25 10:17
 *
 * @author YOLANDA;
 */
public class TimeoutError extends Exception {

    private static final long serialVersionUID = 1164986L;

    public TimeoutError() {
    }

    public TimeoutError(String detailMessage) {
        super(detailMessage);
    }

}
