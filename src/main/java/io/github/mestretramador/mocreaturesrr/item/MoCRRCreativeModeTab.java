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

package io.github.mestretramador.mocreaturesrr.item;

import io.github.mestretramador.mocreaturesrr.MoCreaturesReduxRedone;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

/**
 * All MoC R&R Creative Mode Tabs follows
 * the Minecraft {@link CreativeModeTab base} structure.
 *
 * @since 0.0.0.3
 * @author Mestre Tramador
 */
public abstract class MoCRRCreativeModeTab extends CreativeModeTab
{
    /**
     * In order to create a Tab on MoC R&R, only
     * the identifier label shall be passed.
     *
     * @param label The label to identify the tab.
     */
    public MoCRRCreativeModeTab(String label)
    {
        super(MoCreaturesReduxRedone.ID.concat(".").concat(label));
    }

    /**
     * Represents the icon of the Tab.
     * The stack can hold an item itself or a block.
     */
    public abstract ItemStack makeIcon();
}