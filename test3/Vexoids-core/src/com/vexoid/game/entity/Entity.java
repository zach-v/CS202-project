package com.vexoid.game.entity;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.math.Vector2;

public abstract class Entity {

	protected Texture texture;
	protected Vector2 pos;
	protected Vector2 direction;
	
	public Entity(Texture texture, Vector2 pos, Vector2 direction) {
		this.texture = texture;
		this.pos = pos;
		this.direction = direction;
	}
	public abstract void update();
	
	public void render(SpriteBatch sb) {
		sb.draw(texture, pos.x, pos.y);
	}
	public Vector2 getPosition() {
		return pos;
	}
	public Rectangle getBounds() {
		return new Rectangle((pos.x + (texture.getWidth()/2)), (pos.y + (texture.getHeight()/2)),
				(texture.getWidth()- (texture.getWidth()/2)), (texture.getHeight()-(texture.getHeight()/2)));
	}
	public void setDirection(float x, float y) {
		direction.set(x, y);
		direction.scl(Gdx.graphics.getDeltaTime());
	}
	
}