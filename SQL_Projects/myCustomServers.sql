CREATE DATABASE cm_devices;
USE cm_devices;
INSERT INTO devices (deviceID, deviceName, price)
VALUES (
        'deviceID:int',
        'deviceName:varchar',
        'price: DECIMAL'
    );
INSERT INTO stock (deviceID, quantity, totalPrice)
VALUES (
        'deviceID:int',
        'quantity:int',
        'totalPrice: DECIMAL'
    );