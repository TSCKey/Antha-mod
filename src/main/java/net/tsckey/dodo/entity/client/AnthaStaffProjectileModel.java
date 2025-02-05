package net.tsckey.dodo.entity.client;

import net.minecraft.client.model.*;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.entity.model.EntityModel;
import net.minecraft.client.render.entity.model.EntityModelLayer;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;
import net.tsckey.dodo.Antha;
import net.tsckey.dodo.entity.custom.AnthaStaffProjectileEntity;
import net.tsckey.dodo.item.custom.AnthaStaff;

public class AnthaStaffProjectileModel extends EntityModel<AnthaStaffProjectileEntity> {
    public static final EntityModelLayer Antha_Staff = new EntityModelLayer(Identifier.of(Antha.MOD_ID, "antha_staff"), "main");
    private final ModelPart anthaStaff;

    public AnthaStaffProjectileModel(ModelPart root) {
        this.anthaStaff = root.getChild("antha_staff");
    }
    public static TexturedModelData getTexturedModelData() {
        ModelData modelData = new ModelData();
        ModelPartData modelPartData = modelData.getRoot();
        ModelPartData antha_staff = modelPartData.addChild("antha_staff", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 16.5F, 0.0F));

        ModelPartData cube_r1 = antha_staff.addChild("cube_r1", ModelPartBuilder.create().uv(8, 7).cuboid(1.5F, 2.5F, -0.5F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -7.0F, -4.0F, 0.0F, -1.5708F, 0.0F));

        ModelPartData cube_r2 = antha_staff.addChild("cube_r2", ModelPartBuilder.create().uv(7, 9).cuboid(0.5F, -1.5F, -0.5F, 2.0F, 5.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -7.0F, -5.0F, 0.0F, -1.5708F, 0.0F));

        ModelPartData cube_r3 = antha_staff.addChild("cube_r3", ModelPartBuilder.create().uv(3, 10).cuboid(-2.5F, -1.5F, -0.5F, 1.0F, 4.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -7.0F, 5.0F, 0.0F, -1.5708F, 0.0F));

        ModelPartData cube_r4 = antha_staff.addChild("cube_r4", ModelPartBuilder.create().uv(1, 4).cuboid(-2.5F, -1.5F, 0.0F, 5.0F, 3.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -7.0F, 0.0F, 0.0F, -1.5708F, 0.0F));

        ModelPartData cube_r5 = antha_staff.addChild("cube_r5", ModelPartBuilder.create().uv(18, 1).cuboid(-0.5F, -9.0F, -0.5F, 1.0F, 18.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -1.5F, 0.0F, 0.0F, -0.7854F, 0.0F));
        return TexturedModelData.of(modelData, 32, 32);
    }
    @Override
    public void setAngles(AnthaStaffProjectileEntity entity, float limbAngle, float limbDistance, float animationProgress, float headYaw, float headPitch) {

    }

    @Override
    public void render(MatrixStack matrices, VertexConsumer vertices, int light, int overlay, int color) {
    anthaStaff.render(matrices, vertices, light, overlay, color);
    }
}
