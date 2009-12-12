package com.insurgentgames.exterminoid.gui;

import com.insurgentgames.exterminoid.gui.screen.AbstractScreen;

import junit.framework.TestCase;

public class ScreenTest extends TestCase {

    public void testAddSpriteNegativeLayer() {
        try {
            new DummyAbstractScreen().addSpriteWithNegativeLayer();
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException illegalArgumentException) {
            assertEquals(illegalArgumentException.getMessage(), "Number of layer must be zero or higher");
        } catch (Exception exception) {
            fail("Wrong exception thrown: " + exception.getClass());
        }
    }

    public void testAddSpriteExceedingMaxLayerCount() throws Exception {
        try {
            new DummyAbstractScreen().addSpriteExceedingMaxLayerCount();
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException illegalArgumentException) {
            assertEquals(illegalArgumentException.getMessage(), "Number of layers exceeded (10)");
        } catch (Exception exception) {
            fail("Wrong exception thrown: " + exception.getClass());
        }
    }

    public class DummyAbstractScreen extends AbstractScreen {

        public DummyAbstractScreen() {
            super(null);
        }

        public void show() {
        }

        public void addSpriteWithNegativeLayer() {
            addSprite(null, -1);
        }

        public void addSpriteExceedingMaxLayerCount() {
            addSprite(null, MAX_LAYER_COUNT);
        }

    }
}
