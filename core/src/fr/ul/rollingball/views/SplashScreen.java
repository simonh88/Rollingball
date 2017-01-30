package fr.ul.rollingball.views;

import com.badlogic.gdx.ScreenAdapter;
import com.badlogic.gdx.graphics.Camera;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.utils.viewport.FitViewport;
import com.badlogic.gdx.utils.viewport.Viewport;


import fr.ul.rollingball.RollingBall;
import fr.ul.rollingball.dataFactories.TextureFactory;

/**
 * Created by hajek1u on 24/01/17.
 */

public class SplashScreen extends ScreenAdapter{

    private RollingBall rollingBall;
    private SpriteBatch spriteBatch;
    private float time;
    private Camera camera;

    public SplashScreen(RollingBall rollingBall){
        this.rollingBall = rollingBall;
        this.spriteBatch = new SpriteBatch();
        camera = new OrthographicCamera(rollingBall.getWidth(), rollingBall.getHeight());
        Viewport vp = new FitViewport(rollingBall.getWidth(), rollingBall.getHeight());
        camera.position.set(new Vector2(camera.viewportWidth/2f, camera.viewportHeight/2f), 0f);
        camera.update();
        spriteBatch.setProjectionMatrix(camera.combined);
    }


    @Override
    public void show () {
        this.time = 0;
    }

    @Override
    public void render(float delta){

        Texture intro = TextureFactory.getInstance().getIntro();
        this.spriteBatch.begin();
        this.spriteBatch.draw(intro, 0, 0);
        this.spriteBatch.end();
        time += delta;
        if(time >= 3){
            rollingBall.display_game();
        }
    }

    @Override
    public void dispose () {
        spriteBatch.dispose();
        //img.dispose();
    }

}
