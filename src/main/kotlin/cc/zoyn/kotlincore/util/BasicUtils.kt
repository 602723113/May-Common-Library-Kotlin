package cc.zoyn.kotlincore.util

import com.google.common.collect.Lists
import org.bukkit.Bukkit
import org.bukkit.entity.Player
import java.util.*
import java.util.function.Consumer

/**
 * 基础工具类
 *
 * @author Zoyn
 * @since 2017-12-19
 */
object BasicUtils {

    /**
     * 取服务器所有在线的玩家集合
     * <br />
     * get server all online players
     *
     * @return the server All online players list
     */
    fun getOnlinePlayers(): List<Player> {
        val playerList = Lists.newArrayList<Player>()
        val worldList = Bukkit.getWorlds()

        worldList.forEach(Consumer { world ->
            if (!world.players.isEmpty()) {
                playerList.addAll(world.players)
            }
        })
        return playerList
    }

    /**
     * convert player name to UUID
     *
     * @param name the player name
     * @return the name of the corresponding uuid
     */
    fun convertPlayerNameToUUID(name: String): UUID {
        val player = Bukkit.getPlayerExact(name)
        return if (player != null) player.uniqueId else UUID.nameUUIDFromBytes("OfflinePlayer:$name".toByteArray())

    }
}