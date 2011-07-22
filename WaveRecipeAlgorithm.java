// 
//  WaveRecipeAlgorithm.java
//  AndroidWaveProject
//  
//  Created by Philip Kuryloski on 2011-02-02.
//  Copyright 2011 University of California, Berkeley. All rights reserved.
// 

package edu.berkeley.androidwave.waverecipe.waverecipealgorithm;

import java.util.Map;

/**
 * WaveRecipeAlgorithm
 *
 * Interface describing a WaveRecipeAlgorithm, which provides the
 * computational component of a WaveRecipe.  Recipe creators must implement
 * this interface, and provide that implementation within their recipe.
 * 
 * Arguments not included within Android are generic objects, because the
 * dynamic loading used to instantiate this algorithm in Android results in
 * two separate namespaces. Therefore, we essentially cannot cast or type
 * easily at compile time.
 * 
 * For conviencience, recipe developers are provided with
 * WaveRecipeAlgorithmListenerShadow calls methods across the distinct
 * namespaces
 */
public interface WaveRecipeAlgorithm {
    
    /**
     * setAuthorizedMaxOutputRate
     * 
     * Provides a hint to the WaveRecipeAlgorithm of what data rate it is
     * allowed to produce (without being throttled by AndroidWave)
     */
    public void setAuthorizedMaxOutputRate(double maxOutputRate) throws Exception;
    
    /**
     * setWaveRecipeAlgorithmListener
     * 
     * @param listener should implement the WaveRecipeAlgorithmListener interface
     */
    public boolean setWaveRecipeAlgorithmListener(Object listener) throws Exception;
    
    public void ingestSensorData(long time, Map<String, Double>values) throws Exception;
}