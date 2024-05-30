package PatronesEstructurales.flyweight;

import PatronesEstructurales.flyweight.assets.AssetsPrefab;
import PatronesEstructurales.flyweight.assets.Prefab;

public class NpcFactory {
    public static Npc createNpc(Prefab prefab){
        Prefab prefabNew= AssetsPrefab.getPrefab(prefab);
        Npc npc=new Npc(prefabNew);
        return npc;
    }
}
