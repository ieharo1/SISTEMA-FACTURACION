# 🧾 Sistema de Facturación (Billing)

Proyecto desarrollado por **Isaac Esteban Haro Torres**.

---

## 📝 Descripción

Sistema completo de gestión de facturación para pequeñas y medianas empresas. Permite gestionar clientes, productos, facturas, items de facturas y pagos.

### ¿Qué hace este proyecto?

- **Gestión de Clientes**: Registro y administración de clientes
- **Productos**: Catálogo de productos con precios
- **Facturas**: Creación y gestión de facturas
- **Items de Factura**: Detalle de productos por factura
- **Pagos**: Seguimiento de pagos realizados
- **Dashboard**: Resumen de facturación y métricas

---

## ✨ Características Principales

| Característica | Descripción |
|----------------|-------------|
| 👥 **Clientes** | Registro y gestión de clientes |
| 📦 **Productos** | Catálogo de productos/servicios |
| 🧾 **Facturas** | Creación y administración de facturas |
| 📝 **Items** | Detalle de productos por factura |
| 💳 **Pagos** | Seguimiento de pagos |
| 📊 **Dashboard** | Métricas de facturación |
| 🔐 **Panel Admin** | Acceso con Filament 3 |

---

## 🛠️ Stack Tecnológico

- **Backend**: PHP 8.2, Laravel 11, Filament 3
- **Frontend**: HTML5, Tailwind CSS (Filament)
- **Base de datos**: MySQL/MariaDB
- **Infraestructura**: Docker, Docker Compose, Nginx

---

## 🚀 Instalación y Uso

### Requisitos

- PHP 8.2+
- Composer
- MySQL/MariaDB
- Docker

### Instalación desde cero

```bash
# Clonar el repositorio
git clone <repositorio>

# Instalar dependencias
composer install

# Copiar archivo de entorno
cp .env.example .env

# Generar clave de aplicación
php artisan key:generate

# Ejecutar migraciones
php artisan migrate

# Poblar base de datos con datos de ejemplo
php artisan db:seed

# Iniciar servidor
php artisan serve
```

### Usar Docker

```bash
# Construir y levantar contenedores
docker compose up -d --build

# Ver estado de los contenedores
docker compose ps

# Acceder al contenedor
docker compose exec app bash

# Ejecutar migraciones dentro del contenedor
php artisan migrate

# Poblar base de datos
php artisan db:seed

# Ver logs
docker compose logs -f app
```

### Credenciales por defecto

| Rol | Email | Contraseña |
|-----|-------|------------|
| Administrador | admin@facturacion.com | password |

---

## 📁 Estructura del Proyecto

```
├── app/
│   ├── Filament/           # Recursos de Filament
│   │   ├── Resources/      # Recursos (CRUD)
│   │   └── Providers/      # Proveedores de Panel
│   └── Models/             # Modelos Eloquent
├── database/
│   ├── migrations/         # Migraciones
│   ├── seeders/            # Seeders
│   └── factories/          # Factories
├── docker-compose.yml      # Docker Compose
├── Dockerfile              # Configuración Docker
└── nginx.conf              # Configuración Nginx
```

---

## 📊 Módulos del Sistema

1. **Dashboard**: Métricas de clientes, facturas y pagos
2. **Clientes**: CRUD de clientes
3. **Productos**: CRUD de productos
4. **Facturas**: CRUD de facturas
5. **Items**: Gestión de items por factura
6. **Pagos**: Seguimiento de pagos

---

## ⚠️ Requisitos del Sistema

- PHP 8.2 o superior
- Composer
- MySQL 8.0 o MariaDB
- Docker

---

## 👨‍💻 Desarrollado por Isaac Esteban Haro Torres

**Ingeniero en Sistemas · Full Stack · Automatización · Data**

- 📧 Email: zackharo1@gmail.com
- 📱 WhatsApp: 098805517
- 💻 GitHub: https://github.com/ieharo1
- 🌐 Portafolio: https://ieharo1.github.io/portafolio-isaac.haro/

---

© 2026 Isaac Esteban Haro Torres - Todos los derechos reservados.
