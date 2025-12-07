package Design_Patterns.FlyWeightPattern.example2;

import java.util.HashMap;
import java.util.Map;

public class IconFactory {
    private Map<String,Icon> iconMap = new HashMap<>();

    public Icon getIcon(String type){
        if(iconMap.containsKey(type)){
            return iconMap.get(type);
        }
        else{
            Icon icon = null;

            if(type.equals("file")){
                icon = new FileIcon("document", "document.png");
            }
            else if(type.equals("folder")){
                icon = new FolderIcon("blue", "document.png");
            }

            iconMap.put(type, icon);
            return icon;
        }
    }
}
