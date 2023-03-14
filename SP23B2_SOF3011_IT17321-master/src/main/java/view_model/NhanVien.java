package view_model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.UUID;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class NhanVien {

    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(
            name = "UUID",
            strategy = "org.hibernate.id.UUIDGenerator"
    )
    private UUID id;

    @Column
    private String ma;

    @Column
    private String ten;

    @Column
    private String tenDem;

    @Column
    private String ho;

    @Column
    private String gioiTinh;

    @Column
    private String ngaySinh;

    @Column
    private String diaChi;

    @Column
    private String sdt;

    @Column
    private String matKhau;










}
