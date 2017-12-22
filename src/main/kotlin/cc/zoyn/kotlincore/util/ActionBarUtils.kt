package cc.zoyn.kotlincore.util

import com.comphenix.protocol.PacketType
import com.comphenix.protocol.ProtocolLibrary
import com.comphenix.protocol.wrappers.WrappedChatComponent
import net.md_5.bungee.api.ChatColor
import org.bukkit.entity.Player

/**
 * Easy to send an actionbar
 *
 * @author Zoyn
 * @since 2017-12-22
 */
object ActionBarUtils {

    /**
     * 给一名玩家发送actionbar
     * <p>
     * send a actionbar to player
     *
     * @param player player object
     * @param message the message
     */
    fun sendBar(player: Player, message: String): Unit {
        val translatedMessage = ChatColor.translateAlternateColorCodes('&', message)

        // create the packet
        val protocolManager = ProtocolLibrary.getProtocolManager()
        val packet = protocolManager.createPacket(PacketType.Play.Server.CHAT)

        // write data
        packet.chatComponents.write(0, WrappedChatComponent.fromText(translatedMessage))
        packet.bytes.write(0, 2.toByte())

        // send packet
        protocolManager.sendServerPacket(player, packet, false)
    }

}