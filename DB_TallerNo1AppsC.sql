CREATE DATABASE taller1Apps;
Use taller1Apps;

INSERT INTO user (id,nombre,apellido,edad,telefono)
VALUES ('1091', "Andres", "Moreno","19","3205426119"),
	('1092', "Daniel", "Prieto","19","3205426119"),
	('1093', "Aleja", "Pardo","20","3128777301"),
    ('1094', "Michell", "Suarez","20","3128777301"),
	('1095', "Nicolas", "Garces","21","312343452");
    
INSERT INTO product (id,nombre,precio,descripcion)
VALUES ('1', "Teclado", 250000,"Teclado Redragon Gamer"),
	('2', "Mouse", 270000,"Mouse Logitech"),
	('3', "MousePad", 120000,"MousePad Gamer Logitech"),
    ('4', "Monitor", 1500000,"Monitor Gamer LG"),
	('5', "Mesa", 500000,"Mesa Gamer En L ");
    
    
INSERT INTO category (id,nombre,descripcion,product)
VALUES ('6', "Tegnologia", "La mejor Tegnologia del universo","Telefono"),
	('7', "Hogar", "Los mejores productos para tu hogar","Nevera"),
	('8', "Vehiculos", "Los mejores carros y motos para sumerce","Spark GT y KTZ 250"),
    ('9', "Inmuebles", "los mejores apartachos para tu comodidad","Apartacho en el poblado"),
	('10', "Moda", "los mejores outfits para lucirle a la jermu","Unos jordan bien groseros");
    
INSERT INTO vehicule (id, nombre , tipo_Vehiculo) 
VALUES ('11', "Spark GT", "Carro"),
	('12', "Kadilac", "Carro"),
	('13', "BMW", "Moto"),
    ('14', "Mercho", "Carro"),
	('15', "KTZ 250", "Moto");
    
    
INSERT INTO cuenta_bancaria (id,numero,titular,saldo)
VALUES ('16', "A4SD5ASD5AS4D", "Andres",10000000),
	('17', "DFG9DFG7DFG6D", "Daniel",20000000),
	('18', "VXCV3XCV4XC5V", "Moreno",30000000),
    ('19', "BDFB2DCB5C975", "Prieto",40000000),
	('20', "VCBDF34C6CV8", "Michell",50000000);
    