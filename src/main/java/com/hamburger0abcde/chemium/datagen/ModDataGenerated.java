package com.hamburger0abcde.chemium.datagen;

import com.hamburger0abcde.chemium.datagen.tags.ModBlockTagsProvider;
import com.hamburger0abcde.chemium.datagen.tags.ModItemTagsProvider;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.fml.common.Mod;
import net.neoforged.neoforge.data.event.GatherDataEvent;

import static com.hamburger0abcde.chemium.Chemium.MODID;

@EventBusSubscriber(modid = MODID, bus = EventBusSubscriber.Bus.MOD)
public class ModDataGenerated {
    @SubscribeEvent
    public static void gatherData(GatherDataEvent event) {
        var generator = event.getGenerator();
        var packOutput = generator.getPackOutput();
        var lookupProvider = event.getLookupProvider();
        var existingFileHelper = event.getExistingFileHelper();

        var blockTagsProvider = new ModBlockTagsProvider(
                packOutput,
                lookupProvider,
                existingFileHelper
        );

        generator.addProvider(event.includeServer(), blockTagsProvider);

        generator.addProvider(event.includeServer(), new ModItemTagsProvider(
                packOutput,
                lookupProvider,
                blockTagsProvider.contentsGetter(),
                existingFileHelper
        ));
    }
}
