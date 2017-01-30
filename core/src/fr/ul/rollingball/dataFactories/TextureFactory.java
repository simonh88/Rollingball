package fr.ul.rollingball.dataFactories;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;

/**
 * Created by hajek1u on 24/01/17.
 */

public class TextureFactory {

    private static TextureFactory textureFactory;

    private static Texture intro;
    private static Texture decor;

    private TextureFactory(){
        intro = new Texture(Gdx.files.internal("images/Intro.jpg"));
        decor = new Texture(Gdx.files.internal("images/Deco.jpg"));
    }


    public Texture getIntro(){
        return intro;
    }

    public Texture getDecor(){
        return decor;
    }

    public static TextureFactory getInstance(){
        if(textureFactory == null){
            textureFactory = new TextureFactory();
        }
        return textureFactory;
    }
}
