package MAIN;

import ENTITY.entity;

public class CollisionChecker {
    UI gp;
    public CollisionChecker(UI gp) {
        this.gp = gp;
    }

    public void checkTile(entity entity) {
        int entityLeftWorldX = entity.worldX + entity.solidArea.x;
        int entityRightWorldX = entity.worldX + entity.solidArea.x + entity.solidArea.width;
        int entityTopWorldY = entity.worldY + entity.solidArea.y;
        int entityBottomWorldY = entity.worldY + entity.solidArea.y + entity.solidArea.height;

        int entityLeftCol = entityLeftWorldX/gp.tileSize;
        int entityRightCol = entityRightWorldX/gp.tileSize;
        int entityTopRow = entityTopWorldY/gp.tileSize;
        int entityBottomRow = entityBottomWorldY/gp.tileSize;

        int tileNum1, tileNum2;

        switch(entity.direction)    {
            case "up":
                entityTopRow = (entityTopWorldY - entity.speed) / gp.tileSize;
                tileNum1 = gp.tileM.mapTileNum[entityLeftCol][entityTopRow];
                tileNum2 = gp.tileM.mapTileNum[entityRightCol][entityTopRow];
                if (gp.tileM.tile[tileNum1].colliaion == true || gp.tileM.tile[tileNum2].colliaion == true) {
                    entity.collisionOn = true;
                }
                break;
            case "down":
                entityBottomRow = (entityBottomWorldY + entity.speed) / gp.tileSize;
                tileNum1 = gp.tileM.mapTileNum[entityLeftCol][entityBottomRow];
                tileNum2 = gp.tileM.mapTileNum[entityRightCol][entityBottomRow];
                if (gp.tileM.tile[tileNum1].colliaion == true || gp.tileM.tile[tileNum2].colliaion == true) {
                    entity.collisionOn = true;
                }
                 break;
            case "left":
                entityLeftCol = (entityLeftWorldX - entity.speed) / gp.tileSize;
                tileNum1 = gp.tileM.mapTileNum[entityLeftCol][entityTopRow];
                tileNum2 = gp.tileM.mapTileNum[entityLeftCol][entityBottomRow];
                if (gp.tileM.tile[tileNum1].colliaion == true || gp.tileM.tile[tileNum2].colliaion == true) {
                    entity.collisionOn = true;
                }
                break;
            case "right":
                entityRightCol = (entityRightWorldX + entity.speed) / gp.tileSize;
                tileNum1 = gp.tileM.mapTileNum[entityRightCol][entityTopRow];
                tileNum2 = gp.tileM.mapTileNum[entityRightCol][entityBottomRow];
                if (gp.tileM.tile[tileNum1].colliaion == true || gp.tileM.tile[tileNum2].colliaion == true) {
                    entity.collisionOn = true;
                }
                break;
        }
    }
    
    public void checkEntity(entity entity, entity[] target) {
        int entityLeftWorldX = entity.worldX + entity.solidArea.x;
        int entityRightWorldX = entity.worldX + entity.solidArea.x + entity.solidArea.width;
        int entityTopWorldY = entity.worldY + entity.solidArea.y;
        int entityBottomWorldY = entity.worldY + entity.solidArea.y + entity.solidArea.height;

        switch(entity.direction) {
            case "up":
                entityTopWorldY -= entity.speed;
                break;
            case "down":
                entityBottomWorldY += entity.speed;
                break;
            case "left":
                entityLeftWorldX -= entity.speed;
                break;
            case "right":
                entityRightWorldX += entity.speed;
                break;
        }

        for(int i = 0; i < target.length; i++) {
            if(target[i] != null) {
                int targetLeftWorldX = target[i].worldX + target[i].solidArea.x;
                int targetRightWorldX = target[i].worldX + target[i].solidArea.x + target[i].solidArea.width;
                int targetTopWorldY = target[i].worldY + target[i].solidArea.y;
                int targetBottomWorldY = target[i].worldY + target[i].solidArea.y + target[i].solidArea.height;

                if(entityLeftWorldX < targetRightWorldX &&
                   entityRightWorldX > targetLeftWorldX &&
                   entityTopWorldY < targetBottomWorldY &&
                   entityBottomWorldY > targetTopWorldY) {
                    entity.collisionOn = true;
                }
            }
        }
    }
}
