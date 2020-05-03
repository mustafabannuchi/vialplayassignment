package com.viaplay.assignment.service;

import org.springframework.cache.Cache.ValueWrapper;
import org.springframework.cache.CacheManager;
import org.springframework.cache.concurrent.ConcurrentMapCacheManager;
import org.springframework.stereotype.Service;

@Service
public class CachingService {
	
    CacheManager cacheManager ;

	public CachingService() {
	       cacheManager =  new ConcurrentMapCacheManager("musicbrainzCache");
	  }
 
    protected void putInCache(final String cacheName, final Object key, final Object value) {
        cacheManager.getCache(cacheName).put(key, value);
    }

    protected Object getObjectFromCache(final String cacheName, final Object key) {
    	Object object = cacheManager.getCache(cacheName).get(key);
        return object != null ? ((ValueWrapper) object).get() : null;
    }

}
