package com.epiicthundercat.naturesgift.ngmobs.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import org.lwjgl.opengl.GL11;

/**
 * NatureSprig by EPIIC
 */
@SideOnly(Side.CLIENT)
public class NatureSprigModel extends ModelBase {
	public ModelRenderer SprigBody;
	public ModelRenderer Head;
	public ModelRenderer HornBase1;
	public ModelRenderer HornTop1;
	public ModelRenderer Horn3rdPiece;
	public ModelRenderer HornBase2;
	public ModelRenderer HornTop2;
	public ModelRenderer Horn3rdPiece2;
	public ModelRenderer Neck1;
	public ModelRenderer Neck2;
	public ModelRenderer RightLegBase1;
	public ModelRenderer RightLegBottom;
	public ModelRenderer RightToe1;
	public ModelRenderer RightToe2;
	public ModelRenderer RightToe3;
	public ModelRenderer LeftLegBase2;
	public ModelRenderer LeftLegBottom2;
	public ModelRenderer LeftToe1;
	public ModelRenderer LeftToe2;
	public ModelRenderer LeftToe3;
	public ModelRenderer RightArmTop;
	public ModelRenderer RightArmSecondPiece;
	public ModelRenderer Staff;
	public ModelRenderer branch;
	public ModelRenderer branchtop1;
	public ModelRenderer Brach2;
	public ModelRenderer branch2top;
	public ModelRenderer Branch3;
	public ModelRenderer Branch3Top;
	public ModelRenderer Crystal;
	public ModelRenderer WoodenPlate1;
	public ModelRenderer WoodenPlate2;
	public ModelRenderer WoodenPlate3;
	public ModelRenderer woodenplate4;
	public ModelRenderer ArmLeft;
	public ModelRenderer LeftArmTop;
	public ModelRenderer woodenplateLeft1;
	public ModelRenderer woodenplateLeft2;
	public ModelRenderer woodenplateLeft3;
	public ModelRenderer woodenplateLeft4;
	public ModelRenderer RightWoodPlate;
	public ModelRenderer LeftWoodPlate;
	public ModelRenderer BckBrchBase;
	public ModelRenderer BckBrchTop;
	public ModelRenderer TopTop;
	public ModelRenderer BackBranch2;
	public ModelRenderer BBtop2;
	public ModelRenderer BBTtop;

	public NatureSprigModel() {
		this.textureWidth = 128;
		this.textureHeight = 128;

		this.SprigBody = new ModelRenderer(this, 60, 75);
		this.SprigBody.setRotationPoint(-13.5F, -26.5F, 0.4F);
		this.SprigBody.addBox(-11.0F, -2.0F, -6.0F, 22, 33, 12);
		this.Head = new ModelRenderer(this, 28, 67);
		this.Head.setRotationPoint(-0.5F, -8.0F, -6.0F);
		this.Head.addBox(-5.0F, -12.0F, -4.0F, 10, 12, 7);
		this.SprigBody.addChild(this.Head);
		this.HornBase1 = new ModelRenderer(this, 34, 28);
		this.HornBase1.setRotationPoint(3.0F, -13.0F, -1.3F);
		this.HornBase1.addBox(-1.2F, -2.4F, -0.9F, 3, 4, 3);
		this.HornBase1.mirror = true;
		this.setRotationAngles(this.HornBase1, 0.08482300397719036F, 0.0F, 0.46705011182842415F);
		this.Head.addChild(this.HornBase1);
		this.HornTop1 = new ModelRenderer(this, 35, 21);
		this.HornTop1.setRotationPoint(0.2F, -1.8F, 0.3F);
		this.HornTop1.addBox(-0.9F, -4.1F, -0.8F, 2, 4, 2);
		this.HornTop1.mirror = true;
		this.setRotationAngles(this.HornTop1, 0.0F, 0.0F, 0.3490658503988659F);
		this.HornBase1.addChild(this.HornTop1);
		this.Horn3rdPiece = new ModelRenderer(this, 37, 17);
		this.Horn3rdPiece.setRotationPoint(-0.1F, -5.9F, 0.1F);
		this.Horn3rdPiece.addBox(-0.5F, 0.0F, -0.5F, 1, 2, 1);
		this.HornTop1.addChild(this.Horn3rdPiece);
		this.HornBase2 = new ModelRenderer(this, 34, 28);
		this.HornBase2.setRotationPoint(-3.0F, -12.7F, -1.3F);
		this.HornBase2.addBox(-1.2F, -2.4F, -0.9F, 3, 4, 3);
		this.setRotationAngles(this.HornBase2, 0.0F, 0.0F, -0.46705011182842415F);
		this.Head.addChild(this.HornBase2);
		this.HornTop2 = new ModelRenderer(this, 35, 21);
		this.HornTop2.setRotationPoint(0.5F, -1.8F, 0.7F);
		this.HornTop2.addBox(-1.0F, -4.0F, -1.0F, 2, 4, 2);
		this.setRotationAngles(this.HornTop2, 0.296705972839036F, 0.13962634015954636F, -0.3490658503988659F);
		this.HornBase2.addChild(this.HornTop2);
		this.Horn3rdPiece2 = new ModelRenderer(this, 37, 17);
		this.Horn3rdPiece2.setRotationPoint(-0.1F, -3.2F, 0.6F);
		this.Horn3rdPiece2.addBox(-0.2F, -2.4F, -0.7F, 1, 2, 1);
		this.Horn3rdPiece2.mirror = true;
		this.setRotationAngles(this.Horn3rdPiece2, 0.4483750941584071F, 0.0F, -0.16510814790445383F);
		this.HornTop2.addChild(this.Horn3rdPiece2);
		this.Neck1 = new ModelRenderer(this, 96, 0);
		this.Neck1.setRotationPoint(-0.9F, -3.3F, -1.0F);
		this.Neck1.addBox(-3.8F, -2.0F, -4.0F, 8, 6, 8);
		this.setRotationAngles(this.Neck1, 0.46705011182842415F, 0.0F, 0.0F);
		this.SprigBody.addChild(this.Neck1);
		this.Neck2 = new ModelRenderer(this, 0, 58);
		this.Neck2.setRotationPoint(0.1F, -7.0F, -2.0F);
		this.Neck2.addBox(-3.0F, -2.0F, -2.0F, 6, 7, 6);
		this.Neck1.addChild(this.Neck2);
		this.RightLegBase1 = new ModelRenderer(this, 26, 86);
		this.RightLegBase1.setRotationPoint(6.0F, 31.1F, -1.0F);
		this.RightLegBase1.addBox(-4.0F, -2.0F, -2.0F, 8, 22, 8);
		this.setRotationAngles(this.RightLegBase1, 0.2546435405291338F, 0.0F, -0.06981317007977318F);
		this.SprigBody.addChild(this.RightLegBase1);
		this.RightLegBottom = new ModelRenderer(this, 64, 4);
		this.RightLegBottom.setRotationPoint(0.0F, 18.5F, 0.0F);
		this.RightLegBottom.addBox(-4.0F, -2.0F, -2.0F, 8, 23, 8);
		this.setRotationAngles(this.RightLegBottom, -0.5094616179782085F, 0.0F, 0.0F);
		this.RightLegBase1.addChild(this.RightLegBottom);
		this.RightToe1 = new ModelRenderer(this, 96, 39);
		this.RightToe1.setRotationPoint(2.9F, 21.0F, 0.0F);
		this.RightToe1.addBox(-1.0F, -1.0F, -7.0F, 3, 3, 13);
		this.setRotationAngles(this.RightToe1, 0.38554323442870847F, -0.20001473294434044F, 0.0F);
		this.RightLegBottom.addChild(this.RightToe1);
		this.RightToe2 = new ModelRenderer(this, 96, 55);
		this.RightToe2.setRotationPoint(-0.5F, 21.0F, 0.0F);
		this.RightToe2.addBox(-1.0F, -1.0F, -7.0F, 3, 3, 13);
		this.setRotationAngles(this.RightToe2, 0.33964105645913F, 0.12740903872453743F, 0.0F);
		this.RightLegBottom.addChild(this.RightToe2);
		this.RightToe3 = new ModelRenderer(this, 60, 57);
		this.RightToe3.setRotationPoint(-3.0F, 21.0F, 2.0F);
		this.RightToe3.addBox(-1.0F, -1.0F, -7.0F, 3, 3, 11);
		this.setRotationAngles(this.RightToe3, 0.33964105645913F, 0.33964105645913F, 0.0F);
		this.RightLegBottom.addChild(this.RightToe3);
		this.LeftLegBase2 = new ModelRenderer(this, 26, 86);
		this.LeftLegBase2.setRotationPoint(-6.0F, 31.1F, -1.0F);
		this.LeftLegBase2.addBox(-4.0F, -2.0F, -2.0F, 8, 22, 8);
		this.LeftLegBase2.mirror = true;
		this.setRotationAngles(this.LeftLegBase2, 0.2546435405291338F, 0.0F, 0.06981317007977318F);
		this.SprigBody.addChild(this.LeftLegBase2);
		this.LeftLegBottom2 = new ModelRenderer(this, 64, 4);
		this.LeftLegBottom2.setRotationPoint(0.0F, 18.5F, 0.0F);
		this.LeftLegBottom2.addBox(-4.0F, -2.0F, -2.0F, 8, 23, 8);
		this.setRotationAngles(this.LeftLegBottom2, -0.5094616179782085F, 0.0F, 0.0F);
		this.LeftLegBase2.addChild(this.LeftLegBottom2);
		this.LeftToe1 = new ModelRenderer(this, 96, 39);
		this.LeftToe1.setRotationPoint(-2.9F, 21.0F, 0.0F);
		this.LeftToe1.addBox(-1.0F, -1.0F, -7.0F, 3, 3, 13);
		this.LeftToe1.mirror = true;
		this.setRotationAngles(this.LeftToe1, 0.38554323442870847F, 0.32986722196902557F, 0.0F);
		this.LeftLegBottom2.addChild(this.LeftToe1);
		this.LeftToe2 = new ModelRenderer(this, 96, 39);
		this.LeftToe2.setRotationPoint(0.0F, 21.0F, 0.0F);
		this.LeftToe2.addBox(-1.0F, -1.0F, -7.0F, 3, 3, 13);
		this.LeftToe2.mirror = true;
		this.setRotationAngles(this.LeftToe2, 0.34382987595868836F, -0.03490658503988659F, 0.0F);
		this.LeftLegBottom2.addChild(this.LeftToe2);
		this.LeftToe3 = new ModelRenderer(this, 60, 57);
		this.LeftToe3.setRotationPoint(3.0F, 21.0F, 2.0F);
		this.LeftToe3.addBox(-1.0F, -1.0F, -7.0F, 3, 3, 11);
		this.LeftToe3.mirror = true;
		this.setRotationAngles(this.LeftToe3, 0.33964105645913F, -0.33964105645913F, 0.0F);
		this.LeftLegBottom2.addChild(this.LeftToe3);
		this.RightArmTop = new ModelRenderer(this, 0, 71);
		this.RightArmTop.setRotationPoint(10.0F, 4.0F, -1.0F);
		this.RightArmTop.addBox(-3.0F, -1.0F, -3.0F, 6, 16, 6);
		this.RightArmTop.mirror = true;
		this.setRotationAngles(this.RightArmTop, 0.0F, 0.0F, -0.8915142138766367F);
		this.SprigBody.addChild(this.RightArmTop);
		this.RightArmSecondPiece = new ModelRenderer(this, 0, 93);
		this.RightArmSecondPiece.setRotationPoint(-0.7F, 15.0F, -0.2F);
		this.RightArmSecondPiece.addBox(-2.0F, -1.0F, -3.0F, 6, 17, 6);
		this.RightArmSecondPiece.mirror = true;
		this.setRotationAngles(this.RightArmSecondPiece, -0.7216936190680444F, -0.46705011182842415F,
				-0.8066912015770679F);
		this.RightArmTop.addChild(this.RightArmSecondPiece);
		this.Staff = new ModelRenderer(this, 0, 122);
		this.Staff.setRotationPoint(18.0F, 22.0F, -6.0F);
		this.Staff.addBox(-64.0F, -1.0F, -1.0F, 60, 3, 3);
		this.setRotationAngles(this.Staff, -0.7641051252178287F, 0.33964105645913F, 0.42446406875869874F);
		this.RightArmSecondPiece.addChild(this.Staff);
		this.branch = new ModelRenderer(this, 0, 34);
		this.branch.setRotationPoint(-3.6F, -1.0F, 0.0F);
		this.branch.addBox(0.0F, 0.0F, -2.0F, 13, 3, 3);
		this.setRotationAngles(this.branch, 0.08482300397719036F, 0.7641051252178287F, 0.21223203437934937F);
		this.Staff.addChild(this.branch);
		this.branchtop1 = new ModelRenderer(this, 1, 28);
		this.branchtop1.setRotationPoint(13.0F, 0.7F, -1.4F);
		this.branchtop1.addBox(-0.2F, -0.7F, -0.6F, 11, 3, 3);
		this.branchtop1.mirror = true;
		this.setRotationAngles(this.branchtop1, -0.12740903872453743F, -1.1037462482559859F, -0.67928211291826F);
		this.branch.addChild(this.branchtop1);
		this.Brach2 = new ModelRenderer(this, 0, 34);
		this.Brach2.setRotationPoint(-2.0F, 0.1F, 1.0F);
		this.Brach2.addBox(-1.0F, -1.0F, -2.0F, 13, 3, 3);
		this.Brach2.mirror = true;
		this.setRotationAngles(this.Brach2, 0.6688101640379048F, -0.7698647437073431F, -1.273566776485551F);
		this.branch.addChild(this.Brach2);
		this.branch2top = new ModelRenderer(this, 1, 28);
		this.branch2top.setRotationPoint(11.3F, -0.3F, -1.3F);
		this.branch2top.addBox(-0.2F, -0.7F, -0.6F, 11, 3, 3);
		this.setRotationAngles(this.branch2top, -0.017453292519943295F, 0.3103195529888167F, 1.2386601914456645F);
		this.Brach2.addChild(this.branch2top);
		this.Branch3 = new ModelRenderer(this, 0, 34);
		this.Branch3.setRotationPoint(-1.0F, 3.0F, -2.0F);
		this.Branch3.addBox(0.0F, 0.0F, 0.0F, 13, 3, 3);
		this.setRotationAngles(this.Branch3, 0.5942845969882637F, -0.8491027077268521F, 0.7641051252178287F);
		this.branch.addChild(this.Branch3);
		this.Branch3Top = new ModelRenderer(this, 1, 28);
		this.Branch3Top.setRotationPoint(10.0F, 0.0F, 0.0F);
		this.Branch3Top.addBox(0.0F, 0.0F, 0.0F, 11, 3, 3);
		this.setRotationAngles(this.Branch3Top, -0.17453292519943295F, -0.6042329683983093F, -0.8344419393469388F);
		this.Branch3.addChild(this.Branch3Top);
		this.Crystal = new ModelRenderer(this, 0, 19);
		this.Crystal.setRotationPoint(6.0F, -2.4F, 5.9F);
		this.Crystal.addBox(0.0F, 0.0F, 0.0F, 4, 4, 4);
		this.branch.addChild(this.Crystal);
		this.WoodenPlate1 = new ModelRenderer(this, 0, 41);
		this.WoodenPlate1.setRotationPoint(2.0F, 1.1F, -2.5F);
		this.WoodenPlate1.addBox(0.0F, 0.0F, 0.0F, 2, 10, 5);
		this.WoodenPlate1.mirror = true;
		this.setRotationAngles(this.WoodenPlate1, 0.0F, -0.08726646259971647F, 0.03490658503988659F);
		this.RightArmTop.addChild(this.WoodenPlate1);
		this.WoodenPlate2 = new ModelRenderer(this, 28, 0);
		this.WoodenPlate2.setRotationPoint(-1.8F, 5.0F, -3.0F);
		this.WoodenPlate2.addBox(-1.0F, -4.0F, -1.0F, 5, 10, 2);
		this.setRotationAngles(this.WoodenPlate2, -0.08377580742467917F, -0.13962634015954636F, -0.03490658503988659F);
		this.RightArmTop.addChild(this.WoodenPlate2);
		this.WoodenPlate3 = new ModelRenderer(this, 28, 0);
		this.WoodenPlate3.setRotationPoint(-2.5F, 2.2F, 0.9F);
		this.WoodenPlate3.addBox(0.0F, -0.2F, 0.4F, 5, 10, 2);
		this.WoodenPlate3.mirror = true;
		this.setRotationAngles(this.WoodenPlate3, 0.12217304763960307F, 0.0F, 0.0F);
		this.RightArmTop.addChild(this.WoodenPlate3);
		this.woodenplate4 = new ModelRenderer(this, 0, 41);
		this.woodenplate4.setRotationPoint(-4.0F, 4.0F, -2.5F);
		this.woodenplate4.addBox(0.0F, 0.0F, 0.0F, 2, 10, 5);
		this.RightArmTop.addChild(this.woodenplate4);
		this.ArmLeft = new ModelRenderer(this, 0, 71);
		this.ArmLeft.setRotationPoint(-9.0F, 4.0F, -1.0F);
		this.ArmLeft.addBox(-4.0F, -2.0F, -2.0F, 6, 16, 6);
		this.setRotationAngles(this.ArmLeft, 0.0F, 0.0F, 0.5942845969882637F);
		this.SprigBody.addChild(this.ArmLeft);
		this.LeftArmTop = new ModelRenderer(this, 0, 93);
		this.LeftArmTop.setRotationPoint(-3.0F, 13.0F, 1.0F);
		this.LeftArmTop.addBox(-1.0F, -1.0F, -3.0F, 6, 16, 6);
		this.setRotationAngles(this.LeftArmTop, -0.46705011182842415F, 0.0F, 0.0F);
		this.ArmLeft.addChild(this.LeftArmTop);
		this.woodenplateLeft1 = new ModelRenderer(this, 0, 41);
		this.woodenplateLeft1.setRotationPoint(0.4F, 0.0F, -1.7F);
		this.woodenplateLeft1.addBox(0.0F, 0.0F, 0.0F, 2, 10, 5);
		this.setRotationAngles(this.woodenplateLeft1, 0.0F, 0.08482300397719036F, 5.235987638949542E-4F);
		this.ArmLeft.addChild(this.woodenplateLeft1);
		this.woodenplateLeft2 = new ModelRenderer(this, 0, 41);
		this.woodenplateLeft2.setRotationPoint(-2.6F, 4.0F, -2.0F);
		this.woodenplateLeft2.addBox(-1.0F, -4.0F, -1.0F, 2, 10, 5);
		this.setRotationAngles(this.woodenplateLeft2, 0.0F, 1.5707963267948966F, 0.0F);
		this.ArmLeft.addChild(this.woodenplateLeft2);
		this.woodenplateLeft3 = new ModelRenderer(this, 0, 41);
		this.woodenplateLeft3.setRotationPoint(1.6F, 0.0F, 2.5F);
		this.woodenplateLeft3.addBox(0.0F, 0.0F, 0.0F, 2, 10, 5);
		this.setRotationAngles(this.woodenplateLeft3, 0.0F, -1.5009831567151235F, 0.0F);
		this.ArmLeft.addChild(this.woodenplateLeft3);
		this.woodenplateLeft4 = new ModelRenderer(this, 0, 41);
		this.woodenplateLeft4.setRotationPoint(-4.7F, 0.0F, -1.3F);
		this.woodenplateLeft4.addBox(0.0F, 0.0F, 0.0F, 2, 10, 5);
		this.ArmLeft.addChild(this.woodenplateLeft4);
		this.RightWoodPlate = new ModelRenderer(this, 112, 24);
		this.RightWoodPlate.setRotationPoint(2.1F, 1.1F, -7.1F);
		this.RightWoodPlate.addBox(0.0F, 0.0F, 0.0F, 6, 8, 2);
		this.setRotationAngles(this.RightWoodPlate, 0.05759586448357504F, 0.03193952606051029F, 0.0F);
		this.SprigBody.addChild(this.RightWoodPlate);
		this.LeftWoodPlate = new ModelRenderer(this, 112, 24);
		this.LeftWoodPlate.setRotationPoint(-4.8F, 5.0F, -5.6F);
		this.LeftWoodPlate.addBox(-2.9F, -4.0F, -1.0F, 6, 8, 2);
		this.LeftWoodPlate.mirror = true;
		this.setRotationAngles(this.LeftWoodPlate, -0.08482300397719036F, 0.04241150198859518F, 0.0F);
		this.SprigBody.addChild(this.LeftWoodPlate);
		this.BckBrchBase = new ModelRenderer(this, 36, 50);
		this.BckBrchBase.setRotationPoint(-9.0F, 0.0F, 7.0F);
		this.BckBrchBase.addBox(0.0F, 0.0F, -5.6F, 4, 4, 13);
		this.setRotationAngles(this.BckBrchBase, 0.8066912015770679F, 0.0F, 0.0F);
		this.SprigBody.addChild(this.BckBrchBase);
		this.BckBrchTop = new ModelRenderer(this, 62, 45);
		this.BckBrchTop.setRotationPoint(0.0F, 0.0F, 7.0F);
		this.BckBrchTop.addBox(0.0F, 0.0F, 0.0F, 4, 4, 26);
		this.setRotationAngles(this.BckBrchTop, 0.0F, 0.42446406875869874F, 0.0F);
		this.BckBrchBase.addChild(this.BckBrchTop);
		this.TopTop = new ModelRenderer(this, 78, 14);
		this.TopTop.setRotationPoint(0.0F, 0.0F, 25.7F);
		this.TopTop.addBox(0.0F, 0.0F, 0.0F, 4, 4, 21);
		this.TopTop.mirror = true;
		this.setRotationAngles(this.TopTop, -0.7216936190680444F, 0.0F, 0.0F);
		this.BckBrchTop.addChild(this.TopTop);
		this.BackBranch2 = new ModelRenderer(this, 36, 50);
		this.BackBranch2.setRotationPoint(0.0F, 3.0F, 6.0F);
		this.BackBranch2.addBox(0.0F, 0.0F, 0.0F, 4, 4, 13);
		this.BackBranch2.mirror = true;
		this.setRotationAngles(this.BackBranch2, 0.5094616179782085F, 0.7641051252178287F, 0.46705011182842415F);
		this.SprigBody.addChild(this.BackBranch2);
		this.BBtop2 = new ModelRenderer(this, 78, 14);
		this.BBtop2.setRotationPoint(1.0F, 1.0F, 9.0F);
		this.BBtop2.addBox(0.0F, 0.0F, 0.0F, 4, 4, 21);
		this.setRotationAngles(this.BBtop2, 0.7641051252178287F, -0.6368706733475028F, 0.0F);
		this.BackBranch2.addChild(this.BBtop2);
		this.BBTtop = new ModelRenderer(this, 33, 18);
		this.BBTtop.setRotationPoint(1.0F, 0.0F, 18.7F);
		this.BBTtop.addBox(0.0F, 0.0F, 0.0F, 4, 4, 23);
		this.setRotationAngles(this.BBTtop, 0.12740903872453743F, -0.5518731241279929F, 0.0F);
		this.BBtop2.addChild(this.BBTtop);
	}

	@Override
	public void render(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float rotationYaw,
			float rotationPitch, float scale) {
		GlStateManager.enableBlend();
		GlStateManager.blendFunc(GL11.GL_SRC_ALPHA, GL11.GL_ONE_MINUS_SRC_ALPHA);
		GlStateManager.color(1.0F, 1.0F, 1.0F, 0.0F);
		this.SprigBody.render(scale);
		GlStateManager.disableBlend();
	}

	public void setRotationAngles(ModelRenderer modelRenderer, float x, float y, float z) {
		
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}
