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

package io.github.mestretramador.mocreaturesrr.init;

import java.util.Collection;
import java.util.stream.Stream;

import io.github.mestretramador.mocreaturesrr.entity.horse.MoCRRHorse;
import io.github.mestretramador.mocreaturesrr.util.MoCRRResourceLocation;

import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;

import net.minecraftforge.registries.RegistryObject;

/**
 * Aggregation of the Mo'Creatures R&R
 * registered {@link net.minecraft.world.entity.Entity Entities}.
 *
 * @since 0.0.0.2
 * @author Mestre Tramador
 */
public final class MoCRREntities
{
    //#region Constructor
    /** This class should not be instantiated. */
    private MoCRREntities() { }
    //#endregion

    //#region IDs
    /** The ID for the {@link MoCRREntities#HORSE Horse} */
    public static final String HORSE_ID = "horse";
    //#endregion

    //#region Entities (Properties)
    /**
     * The <b>Horses</b> are one of the most abundant creature
     * in the world. They run on the massive plain fields and are
     * constantly searched for their natural capabilities.
     *
     * @since 0.0.0.2
     */
    // TODO: Improve Doc Comment for the Horse, matching the Creaturepedia.
    public static final RegistryObject<EntityType<MoCRRHorse>> HORSE = MoCRRRegisters.getEntitiesRegister().register(
        HORSE_ID,
        () -> (
            EntityType
            .Builder
            .of(MoCRRHorse::new, MobCategory.CREATURE)
            .sized(1.3964844f, 1.6f)
            .clientTrackingRange(10)
            .build(new MoCRRResourceLocation(HORSE_ID).toString())
        )
    );
    //#endregion

    //#region Public Methods
    /**
     * All MoC R&R Entities already registered on
     * a immutable {@link Collection}.
     *
     * @return The registered Entities entries.
     */
    public static final Collection<RegistryObject<EntityType<?>>> all()
    {
        return MoCRRRegisters.getEntitiesRegister().getEntries();
    }

    /**
     * All MoC R&R Entities already registered on
     * a {@link Stream} that contains their direct
     * instances.
     *
     * @return The registered Entities.
     */
    public static final Stream<EntityType<?>> allEntityTypes()
    {
        return all().stream().map(RegistryObject::get);
    }

    /**
     * Call this method to register, <b>load</b>, as a matter of speak, the Entity entries.
     */
    public static final void register() { }
    //#endregion
}