package com.minminaya.downloader.observer

interface IMultipleDownLoaderObserver : IDownLoadManagerObserver {
    fun onAllDownLoadComplete(succss: Int, failure: Int)
    fun onAllDownLoadProgress(progress: Int)
}