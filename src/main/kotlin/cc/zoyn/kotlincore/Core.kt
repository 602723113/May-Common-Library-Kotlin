package cc.zoyn.kotlincore

import org.bukkit.plugin.java.JavaPlugin

/**
 * Main Class
 *
 * @author Zoyn
 * @since 2017-12-19
 */
class Core : JavaPlugin() {

    override fun onEnable() {
        instance = this
    }

    companion object {
        @JvmStatic
        lateinit var instance: Core
    }

}