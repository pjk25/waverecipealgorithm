// 
//  WaveRecipeOutputDataListener.java
//  AndroidWaveProject
//  
//  Created by Philip Kuryloski on 2011-02-03.
//  Copyright 2011 University of California, Berkeley. All rights reserved.
// 

package edu.berkeley.androidwave.waverecipe.waverecipealgorithm;

import java.util.Map;

/**
 * WaveRecipeAlgorithmListener
 * 
 * Describes the receiver of a recipe's output, WaveRecipeOutputData. Provided
 * as an interface to simply what is presented to the recipe developer.
 */
public interface WaveRecipeAlgorithmListener {
    
    /**
     * handleRecipeData
     */
    public void handleRecipeData(long time, Map<String, Double> values);
}