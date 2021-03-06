/*
 * This file is part of SpongeAPI, licensed under the MIT License (MIT).
 *
 * Copyright (c) SpongePowered <https://www.spongepowered.org>
 * Copyright (c) contributors
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package org.spongepowered.api.boss;

import org.spongepowered.api.util.generator.dummy.DummyObjectProvider;

/**
 * An enumeration of {@link BossBarOverlay}s.
 */
public final class BossBarOverlays {

    // SORTFIELDS:ON

    /**
     * An overlay with 10 segments.
     */
    public static final BossBarOverlay NOTCHED_10 = DummyObjectProvider.createFor(BossBarOverlay.class, "NOTCHED_10");

    /**
     * An overlay with 12 segments.
     */
    public static final BossBarOverlay NOTCHED_12 = DummyObjectProvider.createFor(BossBarOverlay.class, "NOTCHED_12");

    /**
     * An overlay with 20 segments.
     */
    public static final BossBarOverlay NOTCHED_20 = DummyObjectProvider.createFor(BossBarOverlay.class, "NOTCHED_20");

    /**
     * An overlay with 6 segments.
     */
    public static final BossBarOverlay NOTCHED_6 = DummyObjectProvider.createFor(BossBarOverlay.class, "NOTCHED_6");

    /**
     * A progress bar overlay.
     */
    public static final BossBarOverlay PROGRESS = DummyObjectProvider.createFor(BossBarOverlay.class, "PROGRESS");

    // SORTFIELDS:OFF

    private BossBarOverlays() {
    }

}
