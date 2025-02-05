package net.tsckey.dodo.entity.client;

import net.minecraft.client.render.OverlayTexture;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.EntityRenderer;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.item.ItemRenderer;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.RotationAxis;
import net.tsckey.dodo.Antha;
import net.tsckey.dodo.entity.custom.AnthaStaffProjectileEntity;

public class AnthaStaffProjectileRenderer extends EntityRenderer<AnthaStaffProjectileEntity> {

    protected AnthaStaffProjectileModel model;

    public AnthaStaffProjectileRenderer(EntityRendererFactory.Context ctx) {
        super(ctx);
        this.model = new AnthaStaffProjectileModel(ctx.getPart(AnthaStaffProjectileModel.Antha_Staff));
    }

    @Override
    public void render(AnthaStaffProjectileEntity entity, float yaw, float tickDelta, MatrixStack matrices,
                       VertexConsumerProvider vertexConsumers, int light) {
        matrices.push();

        if(!entity.isGrounded()) {
            matrices.multiply(RotationAxis.POSITIVE_Y.rotationDegrees(MathHelper.lerp(tickDelta, entity.prevYaw, entity.getYaw())));
            matrices.multiply(RotationAxis.POSITIVE_X.rotationDegrees(entity.getRenderingRotation() * 5f));
            matrices.translate(0, -1.0f, 0);
        } else {
            matrices.multiply(RotationAxis.POSITIVE_Y.rotationDegrees(entity.groundedOffset.getY()));
            matrices.multiply(RotationAxis.POSITIVE_X.rotationDegrees(entity.groundedOffset.getX()));
            matrices.translate(0, -1.0f, 0);
        }

        VertexConsumer vertexconsumer = ItemRenderer.getDirectItemGlintConsumer(vertexConsumers,
                this.model.getLayer(Identifier.of(Antha.MOD_ID, "textures/entity/antha_staff/antha_staff.png")), false, false);
        this.model.render(matrices, vertexconsumer, light, OverlayTexture.DEFAULT_UV);

        matrices.pop();
        super.render(entity, yaw, tickDelta, matrices, vertexConsumers, light);
    }





    @Override
    public Identifier getTexture(AnthaStaffProjectileEntity entity) {
        return Identifier.of(Antha.MOD_ID, "textures/entity/antha_staff/antha_staff.png");
    }
}
