package net.nerovaii.test.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.nerovaii.test.Nerovaiitest;

public class ModItemGroup {

    public static final ItemGroup WEED_GROUP = Registry.register(Registries.ITEM_GROUP, new Identifier(Nerovaiitest.MOD_ID, "weed"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.weed"))
                    .icon(() -> new ItemStack(Moditems.WEED)).entries((displayContext, entries) -> {
                        entries.add(Moditems.WEED);
                        entries.add(Moditems.NORTHERN_KRIPPY)

                    }).build())
    public static void RegisterItemGroup() {
        Nerovaiitest.LOGGER.info("Registering ModItemGroup");
    }
}

