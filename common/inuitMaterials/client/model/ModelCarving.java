package inuitMaterials.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

/**
 * Techne :D
 */
public class ModelCarving extends ModelBase {
	
	//Fields
    ModelRenderer Main_Body_Part_1;
    ModelRenderer Dorsal_Fin_Part_1;
    ModelRenderer Anal_Fin;
    ModelRenderer Caudal_Fin_Part_1;
    ModelRenderer Pelvic_Fin;
    ModelRenderer Front_Part_1;
    ModelRenderer Caudal_Fin_Part_2;
    ModelRenderer Eyes;
    ModelRenderer Front_Part_2;
    ModelRenderer Adipose_Fin;
    ModelRenderer Dorsal_Fin_Part_2;
    ModelRenderer Main_Body_Part_2;
    
    public ModelCarving() {
        textureWidth = 32;
        textureHeight = 32;
        
        Main_Body_Part_1 = new ModelRenderer(this, 0, 0);
        Main_Body_Part_1.addBox(0F, 0F, 0F, 1, 4, 12);
        Main_Body_Part_1.setRotationPoint(0F, 19F, -6F);
        Main_Body_Part_1.setTextureSize(32, 32);
        Main_Body_Part_1.mirror = true;
        setRotation(Main_Body_Part_1, 0F, 0F, 0F);
        Dorsal_Fin_Part_1 = new ModelRenderer(this, 0, 0);
        Dorsal_Fin_Part_1.addBox(0F, 0F, 0F, 1, 1, 6);
        Dorsal_Fin_Part_1.setRotationPoint(0F, 17.5F, -3F);
        Dorsal_Fin_Part_1.setTextureSize(32, 32);
        Dorsal_Fin_Part_1.mirror = true;
        setRotation(Dorsal_Fin_Part_1, 0F, 0F, 0F);
        Anal_Fin = new ModelRenderer(this, 0, 0);
        Anal_Fin.addBox(0F, 0F, 0F, 1, 1, 2);
        Anal_Fin.setRotationPoint(0F, 23F, 1.5F);
        Anal_Fin.setTextureSize(32, 32);
        Anal_Fin.mirror = true;
        setRotation(Anal_Fin, 0F, 0F, 0F);
        Caudal_Fin_Part_1 = new ModelRenderer(this, 0, 0);
        Caudal_Fin_Part_1.addBox(0F, 0F, 0F, 1, 2, 1);
        Caudal_Fin_Part_1.setRotationPoint(0F, 20F, 6F);
        Caudal_Fin_Part_1.setTextureSize(32, 32);
        Caudal_Fin_Part_1.mirror = true;
        setRotation(Caudal_Fin_Part_1, 0F, 0F, 0F);
        Pelvic_Fin = new ModelRenderer(this, 0, 0);
        Pelvic_Fin.addBox(0F, 0F, 0F, 1, 1, 2);
        Pelvic_Fin.setRotationPoint(0F, 23F, -2.5F);
        Pelvic_Fin.setTextureSize(32, 32);
        Pelvic_Fin.mirror = true;
        setRotation(Pelvic_Fin, 0F, 0F, 0F);
        Front_Part_1 = new ModelRenderer(this, 0, 0);
        Front_Part_1.addBox(0F, 0F, 0F, 1, 1, 2);
        Front_Part_1.setRotationPoint(0F, 20F, -8F);
        Front_Part_1.setTextureSize(32, 32);
        Front_Part_1.mirror = true;
        setRotation(Front_Part_1, 0F, 0F, 0F);
        Caudal_Fin_Part_2 = new ModelRenderer(this, 0, 0);
        Caudal_Fin_Part_2.addBox(0F, 0F, 0F, 1, 4, 1);
        Caudal_Fin_Part_2.setRotationPoint(0F, 19F, 7F);
        Caudal_Fin_Part_2.setTextureSize(32, 32);
        Caudal_Fin_Part_2.mirror = true;
        setRotation(Caudal_Fin_Part_2, 0F, 0F, 0F);
        Eyes = new ModelRenderer(this, 0, 0);
        Eyes.addBox(0F, 0F, 0F, 3, 1, 1);
        Eyes.setRotationPoint(-1F, 19.66667F, -5F);
        Eyes.setTextureSize(32, 32);
        Eyes.mirror = true;
        setRotation(Eyes, 0F, 0F, 0F);
        Front_Part_2 = new ModelRenderer(this, 0, 0);
        Front_Part_2.addBox(0F, 0F, 0F, 1, 1, 1);
        Front_Part_2.setRotationPoint(0F, 21F, -7F);
        Front_Part_2.setTextureSize(32, 32);
        Front_Part_2.mirror = true;
        setRotation(Front_Part_2, 0F, 0F, 0F);
        Adipose_Fin = new ModelRenderer(this, 0, 0);
        Adipose_Fin.addBox(0F, 0F, 0F, 1, 1, 1);
        Adipose_Fin.setRotationPoint(0F, 18F, 4.75F);
        Adipose_Fin.setTextureSize(32, 32);
        Adipose_Fin.mirror = true;
        setRotation(Adipose_Fin, 0F, 0F, 0F);
        Dorsal_Fin_Part_2 = new ModelRenderer(this, 0, 0);
        Dorsal_Fin_Part_2.addBox(0F, 0F, 0F, 1, 1, 8);
        Dorsal_Fin_Part_2.setRotationPoint(0F, 18F, -4F);
        Dorsal_Fin_Part_2.setTextureSize(32, 32);
        Dorsal_Fin_Part_2.mirror = true;
        setRotation(Dorsal_Fin_Part_2, 0F, 0F, 0F);
        Main_Body_Part_2 = new ModelRenderer(this, 0, 0);
        Main_Body_Part_2.addBox(0F, 0F, 0F, 3, 3, 6);
        Main_Body_Part_2.setRotationPoint(-1F, 19F, -2F);
        Main_Body_Part_2.setTextureSize(32, 32);
        Main_Body_Part_2.mirror = true;
        setRotation(Main_Body_Part_2, 0F, 0F, 0F);
    }

    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        super.render(entity, f, f1, f2, f3, f4, f5);
        setRotationAngles(f, f1, f2, f3, f4, f5, entity);
        Main_Body_Part_1.render(f5);
        Dorsal_Fin_Part_1.render(f5);
        Anal_Fin.render(f5);
        Caudal_Fin_Part_1.render(f5);
        Pelvic_Fin.render(f5);
        Front_Part_1.render(f5);
        Caudal_Fin_Part_2.render(f5);
        Eyes.render(f5);
        Front_Part_2.render(f5);
        Adipose_Fin.render(f5);
        Dorsal_Fin_Part_2.render(f5);
        Main_Body_Part_2.render(f5);
    }
  
    protected void setRotation(ModelRenderer model, float x, float y, float z) {
        model.rotateAngleX = x;
        model.rotateAngleY = y;
        model.rotateAngleZ = z;
    }
	
	
}
