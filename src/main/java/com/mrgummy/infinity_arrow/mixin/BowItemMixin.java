package com.mrgummy.infinity_arrow.mixin;

import net.minecraft.item.BowItem;
import net.minecraft.item.Item;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.ModifyVariable;

@Mixin(BowItem.class)
public class BowItemMixin {

	protected BowItemMixin(Item.Settings settings) {
		super(settings);
	}

	@ModifyVariable()
}


