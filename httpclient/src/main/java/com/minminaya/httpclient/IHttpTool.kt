package com.minminaya.httpclient

import com.minminaya.httpclient.abs.AbsAsynchronousCallBack

interface IHttpTool {
    companion object {
        /**
         * 连接超时时间
         */
        val CONNECT_TIMEOUT = 20 * 1000
        /**
         * 读取超时时间
         */
        val READ_TIMEOUT = 20 * 1000
    }

    /**
     * 同步接口请求。
     *
     * @param url    请求接口地址
     * @param header 请求头
     * @param params 请求参数
     * @return 请求结果
     */
    fun requestSync(url: String, header: HashMap<String, String>, params: HashMap<String, String>,
                    callBack: AbsAsynchronousCallBack): String
}