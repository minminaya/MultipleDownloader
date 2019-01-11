package com.minminaya.downloader.base

import com.minminaya.downloader.observer.IDownLoadManagerObserver

open class BaseDownloader<Ob : IDownLoadManagerObserver> {
    companion object {
        /**
         * 未下载状态
         * */
        @JvmField
        var DOWNLOAD_STATE_UNDOWNLOAD = 0x001
        /**
         * 已下载状态
         * */
        @JvmField
        var DOWNLOAD_STATE_DOWNLOADED = 0x002
        /**
         * 下载中状态
         * */
        @JvmField
        var DOWNLOAD_STATE_DOWNLOADING = 0x003
        /**
         * 暂停状态
         * */
        @JvmField
        var DOWNLOAD_STATE_PAUSED = 0x004
        /**
         * 下载失败状态
         * */
        @JvmField
        var DOWNLOAD_STATE_FAIL = 0x005
        /**
         * 等待下载状态
         * */
        @JvmField
        var DOWNLOAD_STATE_WAITING = 0x006

        var DOWNLOAD_ERROR_NETWORK_ERROR_CODE = 0x006
        var DOWNLOAD_ERROR_DATA_INCORRECT_CODE = 0x006
    }
}