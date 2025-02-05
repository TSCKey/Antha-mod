package net.tsckey.dodo;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.EntityModelLayerRegistry;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.tsckey.dodo.entity.ModEntities;
import net.tsckey.dodo.entity.client.AnthaStaffProjectileModel;
import net.tsckey.dodo.entity.client.AnthaStaffProjectileRenderer;
import net.minecraft.util.Identifier;


public class AnthaClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {

        EntityModelLayerRegistry.registerModelLayer(AnthaStaffProjectileModel.Antha_Staff,AnthaStaffProjectileModel::getTexturedModelData);
        EntityRendererRegistry.register(ModEntities.Antha_Staff, AnthaStaffProjectileRenderer::new);

    }
}
