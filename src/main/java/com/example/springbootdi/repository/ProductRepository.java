package com.example.springbootdi.repository;

import com.example.springbootdi.models.Product;

import java.util.ArrayList;
import  java.util.List;

public class ProductRepository  implements IProductRepository{

    List<Product> data;

    public ProductRepository() {

        this.data = new ArrayList<>(
                List.of(
                        new Product(1L,"Memoria Corsair",500L),
                        new Product(2L,"Monitor",3000L),
                        new Product(3L,"Teclado Razer",700L),
                        new Product(4L,"MotherBoard Gigabyte",490L),
                        new Product(5L,"Mouse Logitech",200L),
                        new Product(6L,"Disco Duro 1TB",1200L),
                        new Product(7L,"SSD Samsung",2500L),
                        new Product(8L,"Fuente de Poder 650W",800L),
                        new Product(9L,"Gabinete Cooler Master",1500L),
                        new Product(10L,"Memoria Kingston",400L),
                        new Product(11L,"Audífonos Sony",600L),
                        new Product(12L,"Micrófono Blue Yeti",3200L),
                        new Product(13L,"Tarjeta de Video Nvidia",4500L),
                        new Product(14L,"Laptop ASUS",15000L),
                        new Product(15L,"Smartphone Samsung",12000L),
                        new Product(16L,"Tablet iPad",10000L),
                        new Product(17L,"Impresora HP",3500L),
                        new Product(18L,"Proyector Epson",9000L),
                        new Product(19L,"Router TP-Link",700L),
                        new Product(20L,"Cámara Canon",25000L),
                        new Product(21L,"Bocinas JBL",2000L),
                        new Product(22L,"Disco Duro Externo",1800L),
                        new Product(23L,"Teclado Mecánico HyperX",1100L),
                        new Product(24L,"Control Xbox",1500L),
                        new Product(25L,"Smartwatch Apple",9000L),
                        new Product(26L,"Monitor UltraWide LG",7000L),
                        new Product(27L,"Memoria USB 64GB",300L),
                        new Product(28L,"Switch de Red Cisco",4500L),
                        new Product(29L,"Lector de Tarjetas",250L),
                        new Product(30L,"Placa Arduino",800L),
                        new Product(31L,"Cargador Universal",500L),
                        new Product(32L,"Webcam Logitech",1200L),
                        new Product(33L,"Cable HDMI",150L),
                        new Product(34L,"Base para Laptop",350L),
                        new Product(35L,"Mouse Pad",100L),
                        new Product(36L,"Repetidor WiFi",950L),
                        new Product(37L,"Lámpara LED",300L),
                        new Product(38L,"Batería Externa",1200L),
                        new Product(39L,"Cámara de Seguridad",4000L),
                        new Product(40L,"Adaptador USB-C",200L),
                        new Product(41L,"Cable Ethernet",100L),
                        new Product(42L,"Soporte para Monitor",600L),
                        new Product(43L,"Ventilador de PC",350L),
                        new Product(44L,"Sistema de Sonido",5000L),
                        new Product(45L,"Hub USB",700L),
                        new Product(46L,"Adaptador Bluetooth",400L),
                        new Product(47L,"Cargador Inalámbrico",900L),
                        new Product(48L,"Monitor Curvo Samsung",8000L),
                        new Product(49L,"Mouse Gamer",1500L),
                        new Product(50L,"Panel Solar",5000L),
                        new Product(51L,"Procesador AMD Ryzen",7500L),
                        new Product(52L,"Placa Base MSI",6200L),
                        new Product(53L,"Tablet Samsung",8500L),
                        new Product(54L,"Consola PlayStation",14000L),
                        new Product(55L,"Soporte para Smartphone",300L),
                        new Product(56L,"Memoria RAM Corsair",1200L),
                        new Product(57L,"Control Remoto Universal",500L),
                        new Product(58L,"Funda para Tablet",200L),
                        new Product(59L,"Auriculares Inalámbricos",1800L),
                        new Product(60L,"Disco SSD Kingston",2900L),
                        new Product(61L,"Estación de Carga",1500L),
                        new Product(62L,"Regulador de Voltaje",1000L),
                        new Product(63L,"Placa Base ASUS",5500L),
                        new Product(64L,"Lentes de Realidad Virtual",15000L),
                        new Product(65L,"Impresora 3D",25000L),
                        new Product(66L,"Multímetro Digital",800L),
                        new Product(67L,"Cámara GoPro",10000L),
                        new Product(68L,"Cable USB-C",120L),
                        new Product(69L,"Monitor Dell",4500L),
                        new Product(70L,"Mouse Razer",1700L),
                        new Product(71L,"Tarjeta de Memoria SD",600L),
                        new Product(72L,"Procesador Intel i7",9500L),
                        new Product(73L,"Placa Base Gigabyte",5200L),
                        new Product(74L,"Disco Duro Seagate",1300L),
                        new Product(75L,"Consola Xbox",13500L),
                        new Product(76L,"Altavoz Amazon Echo",2200L),
                        new Product(77L,"Tablet Huawei",7600L),
                        new Product(78L,"Audífonos Bose",12000L),
                        new Product(79L,"MicroSD 128GB",800L),
                        new Product(80L,"Monitor 4K LG",10000L),
                        new Product(81L,"Hub Ethernet",2000L),
                        new Product(82L,"Cámara Nikon",18000L),
                        new Product(83L,"Lector de Huellas",500L),
                        new Product(84L,"Cargador Solar",2500L),
                        new Product(85L,"Teclado Logitech",1300L),
                        new Product(86L,"Cámara Sony",22000L),
                        new Product(87L,"Regleta Inteligente",800L),
                        new Product(88L,"Enfriador Líquido",4500L),
                        new Product(89L,"Monitor Asus",6200L),
                        new Product(90L,"Funda para Laptop",400L),
                        new Product(91L,"Memoria USB 128GB",500L),
                        new Product(92L,"Base de Carga Rápida",1500L),
                        new Product(93L,"Smartwatch Samsung",8000L),
                        new Product(94L,"Cable VGA",200L),
                        new Product(95L,"Switch HDMI",600L),
                        new Product(96L,"Teclado Apple",2500L),
                        new Product(97L,"Tarjeta de Video AMD",8700L),
                        new Product(98L,"Router ASUS",3200L),
                        new Product(99L,"SSD NVMe",3400L),
                        new Product(100L,"Disco HDD Toshiba",1800L)

                        )
        );


    }
    @Override
    public List<Product> findAll(){
        return data;
    }

    @Override
    public Product findById(Long id){
        return data.stream().filter(p->p.getId().equals(id))
                .findFirst().orElseThrow();
    }
}
