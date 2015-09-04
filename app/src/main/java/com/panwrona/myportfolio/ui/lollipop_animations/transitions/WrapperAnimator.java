package com.panwrona.myportfolio.ui.lollipop_animations.transitions;

import android.animation.Animator;
import android.animation.TimeInterpolator;

public class WrapperAnimator extends Animator {
	private final Animator mWrappedAnimator;

	public WrapperAnimator(Animator wrappedAnimator) {
		mWrappedAnimator = wrappedAnimator;
	}

	@Override
	public long getStartDelay() {
		return mWrappedAnimator.getStartDelay();
	}

	@Override
	public void setStartDelay(long startDelay) {
		mWrappedAnimator.setStartDelay(startDelay);
	}

	@Override
	public Animator setDuration(long duration) {
		mWrappedAnimator.setDuration(duration);
		return this;
	}

	@Override
	public long getDuration() {
		return mWrappedAnimator.getDuration();
	}

	@Override
	public void setInterpolator(TimeInterpolator value) {
		mWrappedAnimator.setInterpolator(value);
	}

	@Override
	public boolean isRunning() {
		return mWrappedAnimator.isRunning();
	}

	@Override
	public void start() {
		mWrappedAnimator.start();
	}

	@Override
	public void cancel() {
		mWrappedAnimator.cancel();
	}

	@Override
	public void pause() {
		if (!isRevealAnimator()) {
			mWrappedAnimator.pause();
		} else {
		}
	}

	@Override
	public void resume() {
		if (!isRevealAnimator()) {
			mWrappedAnimator.resume();
		} else {
		}
	}

	@Override
	public void addListener(AnimatorListener listener) {
		mWrappedAnimator.addListener(listener);
	}

	@Override
	public void removeAllListeners() {
		mWrappedAnimator.removeAllListeners();
	}

	@Override
	public void removeListener(Animator.AnimatorListener listener) {
		mWrappedAnimator.removeListener(listener);
	}

	private boolean isRevealAnimator() {
		return mWrappedAnimator.getClass().getName().contains("RevealAnimator");
	}
}