package fr.ul.rollingball.models;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.physics.box2d.World;

import fr.ul.rollingball.views.GameScreen;

/**
 * Created by hajek1u on 24/01/17.
 */

public abstract class GameElement {

    private World world;
    private Vector2 position;

    public GameElement(World world, Vector2 position){
        this.position = position;
        this.world = world;
    }


    public Vector2 getPosition(){
        return this.position;
    }

    public void updatePosition(Vector2 vitesse){
        position.add(vitesse);
    }

    public abstract void draw(SpriteBatch spriteBatch);
}
