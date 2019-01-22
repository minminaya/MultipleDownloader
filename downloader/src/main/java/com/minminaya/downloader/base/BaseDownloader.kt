package com.minminaya.downloader.base

import com.minminaya.downloader.IDownloadEntity
import com.minminaya.downloader.observer.IDownLoadManagerObserver
import com.minminaya.downloader.utils.UiHelper

/**
 *
 * @author minminaya
 * @email minminaya@gmail.com
 * @time Created by 2019/1/18 18:26
 *
 */
open class BaseDownloader<Ob : IDownLoadManagerObserver> {

    protected var mObserverList: MutableList<Ob>? = null
    protected val mObserversLock: Any = Any()

    companion object {
        val TAG = BaseDownloader::class.simpleName
        /**
         * 未下载状态
         * */
        @JvmField
        val DOWNLOAD_STATE_UNDOWNLOAD = 0x001
        /**
         * 已下载状态
         * */
        @JvmField
        val DOWNLOAD_STATE_DOWNLOADED = 0x002
        /**
         * 下载中状态
         * */
        @JvmField
        val DOWNLOAD_STATE_DOWNLOADING = 0x003
        /**
         * 暂停状态
         * */
        @JvmField
        val DOWNLOAD_STATE_PAUSED = 0x004
        /**
         * 下载失败状态
         * */
        @JvmField
        val DOWNLOAD_STATE_FAIL = 0x005
        /**
         * 等待下载状态
         * */
        @JvmField
        val DOWNLOAD_STATE_WAITING = 0x006

        /**
         * 网络发生错误
         * */
        @JvmField
        val DOWNLOAD_ERROR_NETWORK_ERROR_CODE = 0x101

        /**
         * 数据校验发生错误
         * */
        @JvmField
        val DOWNLOAD_ERROR_DATA_INCORRECT_CODE = 0x102

        /**
         * 网络发生错误log
         * */
        @JvmField
        val DOWNLOAD_ERROR_NETWORK_ERROR_CODE_LOG = "网络发生错误"
        /**
         * 数据校验发生错误log
         * */
        @JvmField
        val DOWNLOAD_ERROR_DATA_INCORRECT_CODE_LOG = "数据校验发生错误"

    }

    constructor() {
        mObserverList = mutableListOf()
    }

    fun register(observer: Ob) {
        synchronized(mObserversLock) {
            mObserverList?.add(observer)
        }
    }

    fun unRegister(observer: Ob) {
        synchronized(mObserversLock) {
            mObserverList?.remove(observer)
        }

    }

    fun clearObserver() {
        synchronized(mObserversLock) {
            mObserverList?.clear()
        }
    }

    fun cancelDownloadEntity(entity: IDownloadEntity) {
        // TODO:lgm 2019/1/22
    }

    fun onDownloadWait(entity: IDownloadEntity) {

    }

    fun onDownloadStart(entity: IDownloadEntity) {

    }

    fun onDownloadProgress(entity: IDownloadEntity) {

    }

    fun onDownloadSuccess(entity: IDownloadEntity) {

    }

    fun onDownloadPause(entity: IDownloadEntity) {

    }

    fun onDownloadFail(entity: IDownloadEntity) {

    }

    fun onDownloadCancel(entity: IDownloadEntity) {
        UiHelper.runOnUiThread {
            val d = 3
        }
    }

    /**
     * 用于在下载完成前做校验工作或者各种比如解压操作的监听器
     * @author minminaya
     * @email minminaya@gmail.com
     * @time Created by 2019/1/22 20:04
     *
     */
    interface IEntityPreValidateListener<T> {
        fun isEntityCorrect(x: T): Boolean
    }
}