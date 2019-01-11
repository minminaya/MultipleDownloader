package com.minminaya.downloader

import com.minminaya.downloader.base.BaseDownloader
import com.minminaya.downloader.observer.IMultipleDownLoaderObserver

class MultipleDownloader<Ob : IMultipleDownLoaderObserver> : BaseDownloader<Ob>() {
}