package com.example.android.miwok;

/**
 * {@link Word} represents a vocabulary word that the user wants to learn.
 * It contains the Miwok word and its corresponding default translation.
 * Created by Vicuko on 17/7/17.
 */

public class Word {

    private String mMiWokTranslation;
    private String mDefaultTranslation;
    private int mImageResourceId = NO_IMAGE_PROVIDED;
    private static final int NO_IMAGE_PROVIDED = -1;
    private int mAudioResourceId;

    public Word(String defaultTranslation, String miWokTranslation) {
        mMiWokTranslation = miWokTranslation;
        mDefaultTranslation = defaultTranslation;
    }

    public Word(String defaultTranslation, String miWokTranslation, int imageResourceId) {
        mMiWokTranslation = miWokTranslation;
        mDefaultTranslation = defaultTranslation;
        mImageResourceId = imageResourceId;
    }

    /**
     * Method to retrieve the default word for this Word pair.
     */
    public String getDefautltTranslation() {
        return mDefaultTranslation;
    }

    /**
     * Method to retrieve the miwok word for this Word pair.
     */
    public String getMiWokTranslation() {
        return mMiWokTranslation;
    }

    public int getImageResourceId(){
        return mImageResourceId;
    }

    /**
     * Returns whether or not there is an image for this word.
     * @return
     */
    public boolean hasImage(){
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }
}
