package addonMasters.packets;

//package rpgRogueBeast.packets;
//
//import ibxm.Player;
//
//import java.util.Random;
//
//public class RpgRBPacketHandler implements IPacketHandler {
//	private Random rand = new Random(5);
//
//	public static final int PETGUI = 2;
//	public static final int CRYSTAL = 11;
//	public static final int STOREPET = 7;
//
//	private void handleRandom(Packet250CustomPayload packet, Player player) {
//
//		EntityPlayer p = (EntityPlayer) player;
//		World world = p.worldObj;
//		int x = (int) p.posX;
//		int y = (int) p.posY;
//		int z = (int) p.posZ;
//		DataInputStream dis = new DataInputStream(new ByteArrayInputStream(
//				packet.data));
//		try {
//			int guiId = dis.readInt();
//			switch (guiId) {
//			case 14:
//				new PacketTeleport(world, p, dis, rand);
//				break;
//			case PETGUI:
//				new PacketPetGui(dis, p);
//				break;
//			case CRYSTAL:
//				new PacketCrystal(dis, p);
//				break;
//			case STOREPET:
//				PlayerRpgInventory inv = PlayerRpgInventory.get(p);
//				if (IPet.playersWithActivePets.containsKey(p.getDisplayName())) {
//					IPet pet = IPet.playersWithActivePets.get(
//							p.getDisplayName()).getPet();
//					if ((pet != null) && !((EntityLiving) pet).isDead) {
//						inv.setInventorySlotContents(6,
//								pet.writePetToItemStack());
//						IPet.playersWithActivePets.remove(p.getDisplayName());
//						((EntityLiving) pet).setDead();
//						PacketInventory.sendPacket(p, inv);
//					}
//				}
//				break;
//			default:
//				break;
//			}
//		} catch (Throwable e) {
//			FMLLog.getLogger().info(
//					"Failed to process packet. rpg rb packethandler.");
//			e.printStackTrace();
//		}
//	}
//
//	@Override
//	public void onPacketData(INetworkManager manager,
//			Packet250CustomPayload packet, Player player) {
//		handleRandom(packet, player);
//	}
//	}
// }
