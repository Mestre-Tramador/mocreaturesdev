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

package io.github.mestretramador.mocreaturesrr.data;

import io.github.mestretramador.mocreaturesrr.MoCreaturesReduxRedone;
import io.github.mestretramador.mocreaturesrr.data.client.item.MoCRRItemModelProvider;
import io.github.mestretramador.mocreaturesrr.data.lang.MoCRREnUsLanguageProvider;

import net.minecraft.data.DataGenerator;

import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.forge.event.lifecycle.GatherDataEvent;

/**
 * <p>
 * Creates and uses the Minecraft's {@link DataGenerator Data Generators} to gather the Data of
 * {@link net.minecraftforge.client.model.generators.ItemModelProvider Item Model providers},
 * and {@link net.minecraftforge.common.data.LanguageProvider Lang providers}.
 * </p>
 * <p>
 * It is subscribed on the Minecraft Forge's Event Bus.
 * </p>
 *
 * @since 0.0.0.1
 * @author Mestre Tramador
 */
@Mod.EventBusSubscriber(modid = MoCreaturesReduxRedone.ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public final class MoCRRDataGenerators
{
    //#region Constructor
    /** This class should not be instantiated. */
    private MoCRRDataGenerators() { }
    //#endregion

    //#region Gathers
    /**
     * Quick caller to gather all Mo'Creatures Redux&Redone
     * stuff that shall be generated, namely Item Models, and Langs.
     *
     * @param event The {@link GatherDataEvent event} that
     *              it is {@link SubscribeEvent subscribed}.
     * @see MoCRRDataGenerators#gatherItems(DataGenerator, ExistingFileHelper) Item Models Gather Caller
     * @see MoCRRDataGenerators#gatherLangs(DataGenerator) Lang Gather Caller
     */
    @SubscribeEvent
    public static void gatherAll(GatherDataEvent event)
    {
        final DataGenerator generator = event.getGenerator();

        final ExistingFileHelper existingFileHelper = event.getExistingFileHelper();

        gatherItems(generator, existingFileHelper);
        gatherLangs(generator);
    }

    /**
     * Gather solely the Mo'Creatures Redux&Redone Item Models.
     *
     * @param generator          The Data Generator, namely the JSON creator, for the Item Models.
     * @param existingFileHelper An Existing File Helper is needed as there is a pattern to follow.
     */
    public static void gatherItems(DataGenerator generator, ExistingFileHelper existingFileHelper)
    {
        generator.addProvider(new MoCRRItemModelProvider(generator, existingFileHelper));
    }

    /**
     * Gather solely the Mo'Creatures Redux&Redone Langs.
     *
     * @param generator The Data Generator, namely the JSON creator, for the Langs.
     */
    public static void gatherLangs(DataGenerator generator)
    {
        generator.addProvider(new MoCRREnUsLanguageProvider(generator));
    }
    //#endregion
}