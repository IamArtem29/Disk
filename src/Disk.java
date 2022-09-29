import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

enum DiskType {
    DVD,
    CDR,
    miniDisk
}

public class Disk {
    int _id;
    DiskType type;
    String[] category;
    String description;

    public Disk(int _id, DiskType type, String[] category, String description) {
        this._id = _id;
        this.type = type;
        this.category = category;
        this.description = description;
    }
}
