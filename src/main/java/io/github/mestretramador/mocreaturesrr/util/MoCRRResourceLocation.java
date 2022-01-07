//#region License
/**
 *  Mo'Creatures Redux&Redone is an attempt to restore the original
 *  DrZharks' Mo'Creatures with redesign ideas.
 *  Copyright (C) 2022 Mestre Tramador
 *
 *  This program is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU General Public License as published by
 *  the Free Software Foundation, either version 3 of the License, or
 *  (at your option) any later version.
 *
 *  This program is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU General Public License for more details.
 *
 *  You should have received a copy of the GNU General Public License
 *  along with this program.  If not, see <https://www.gnu.org/licenses/>.
 */
//#endregion

package io.github.mestretramador.mocreaturesrr.util;

import io.github.mestretramador.mocreaturesrr.MoCreaturesReduxRedone;

import net.minecraft.resources.ResourceLocation;

/**
 * A direct {@link ResourceLocation Resource Location}
 * from Mo'Creatures Redux&Redone.
 *
 * @since 0.0.0.2
 * @author Mestre Tramador
 */
public class MoCRRResourceLocation extends ResourceLocation
{
    /**
     * The Mod ID is already loaded, so just the path must
     * be informed to reach the resource.
     *
     * @param path The folder path to the resource,
     *             no matter its type.
     */
    public MoCRRResourceLocation(String path)
    {
        super(MoCreaturesReduxRedone.ID, path);
    }
}