/*
 * Copyright © YOLANDA. All Rights Reserved
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
package com.yolanda.nohttp;

import java.net.Proxy;

import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;

import com.yolanda.nohttp.able.FinishAble;
import com.yolanda.nohttp.able.QueueAble;
import com.yolanda.nohttp.able.SignCancelAble;
import com.yolanda.nohttp.able.StartAble;

/**
 * <p>Developers provide data interface</p>
 * Created in Dec 21, 2015 4:17:25 PM
 *
 * @author YOLANDA;
 */
public interface ImplClientRequest extends QueueAble, StartAble, SignCancelAble, FinishAble {

    /**
     * Set proxy server
     */
    void setProxy(Proxy proxy);

    /**
     * If the server and {@link ImplServerRequest#needCache()} allow cache, will use this key as the only key to the
     * cache request return data
     *
     * @param key Unique key
     */
    void setCacheKey(String key);

    /**
     * Just read the cache, Is not enabled by default
     */
    void setOnlyReadCache(boolean onlyReadCache);

    /**
     * Read from the cache enabled are failing, Is not enabled by default
     */
    void setRequestFailedReadCache(boolean isEnable);

    /**
     * Sets the SSLsocketfactory for this request
     */
    void setSSLSocketFactory(SSLSocketFactory socketFactory);

    /**
     * Set the HostnameVerifier
     */
    void setHostnameVerifier(HostnameVerifier hostnameVerifier);

    /**
     * Sets the connection timeout time
     *
     * @param connectTimeout timeout number, Unit is a millisecond
     */
    void setConnectTimeout(int connectTimeout);

    /**
     * Sets the read timeout time
     *
     * @param readTimeout timeout number, Unit is a millisecond
     */
    void setReadTimeout(int readTimeout);

    /**
     * Sets redirect interface
     *
     * @param redirectHandler RedirectHandler
     */
    void setRedirectHandler(RedirectHandler redirectHandler);

    /**
     * If there is a key to delete, and then add a new key-value header
     */
    void setHeader(String key, String value);

    /**
     * Add a new key-value header
     */
    void addHeader(String key, String value);

    /**
     * Remove the key from the information
     */
    void removeHeader(String key);

    /**
     * Remove all header
     */
    void removeAllHeader();

    /**
     * Settings you want to post data, if the {@code requestBody} isn't null, then other data
     * will not be sent
     */
    void setRequestBody(byte[] requestBody);

    /**
     * @see #setRequestBody(byte[])
     */
    void setRequestBody(String requestBody);

    /**
     * Set tag of task, At the end of the task is returned to you
     */
    void setTag(Object tag);

}
