# \# ☀ SolarHub

# \### Tienda Virtual de Soluciones de Energía Solar en Colombia

# 

# !\[Android](https://img.shields.io/badge/Android-API%2026+-green)

# !\[Kotlin](https://img.shields.io/badge/Kotlin-1.9-blue)

# !\[Material Design](https://img.shields.io/badge/Material%20Design-3-orange)

# 

# \## Descripción

# SolarHub es una tienda virtual nativa para Android orientada a la comercialización de productos y servicios de energía solar en Colombia. Desarrollada como proyecto académico para la materia \*\*Desarrollo de Aplicaciones Móviles Nativas\*\* de la Fundación Universitaria Compensar.

# 

# \## Estudiante

# \- \*\*Nombre:\*\* Robinson José Zuñiga Jiménez

# \- \*\*Institución:\*\* Fundación Universitaria Compensar

# \- \*\*Programa:\*\* Ingeniería de Software

# \- \*\*Año:\*\* 2026

# 

# \## Roles del Sistema

# | Rol | Descripción |

# |-----|-------------|

# | 👤 Comprador | Navega el catálogo, agrega al carrito y realiza pagos |

# | 🏪 Vendedor | Publica y gestiona su catálogo de productos solares |

# | ⚙ Administrador | Gestiona usuarios, productos y reportes de la plataforma |

# 

# \## Pantallas Implementadas (18)

# 

# \### Transversal

# \- Splash Screen

# \- Login con autenticación biométrica

# \- Recuperar contraseña

# \- Geolocalización — instaladores cercanos

# 

# \### Comprador

# \- Catálogo de productos con filtros

# \- Detalle de producto

# \- Carrito de compras

# \- Pasarela de pagos (Wompi/PSE)

# \- Perfil del comprador

# 

# \### Administrador

# \- Dashboard con KPIs

# \- Gestión de usuarios (CRUD)

# \- Crear/Editar usuario

# \- Gestión de productos

# \- Reportes de ventas

# 

# \### Vendedor

# \- Panel de productos

# \- Crear/Editar producto (con cámara)

# \- Historial de pedidos

# \- Perfil del vendedor

# 

# \## Stack Tecnológico

# \- \*\*Lenguaje:\*\* Kotlin

# \- \*\*IDE:\*\* Android Studio Panda

# \- \*\*Mínimo SDK:\*\* API 26 (Android 8.0)

# \- \*\*Arquitectura:\*\* XML Views + ConstraintLayout

# \- \*\*Diseño:\*\* Material Design 3

# \- \*\*Recursos:\*\* colors.xml, strings.xml, themes.xml centralizados

# 

# \## Colores SolarHub

# | Color | Hex | Uso |

# |-------|-----|-----|

# | Azul Primario | #1A3C6E | Toolbar, botones principales |

# | Verde Acento | #1B6B3A | Rol vendedor, botones acento |

# | Naranja | #E67E22 | Alertas, KPIs |

# 

\## Estructura del Proyecto
app/src/main/
===

# ├── java/com/solarhub/app/

# │   └── MainActivity.kt

# └── res/

# ├── layout/          # 18 pantallas XML

# ├── values/

# │   ├── colors.xml   # Paleta SolarHub

# │   ├── strings.xml  # Textos centralizados

# │   └── themes.xml   # Estilos globales

└── drawable/        # Recursos gráficos

## Cómo ejecutar
===

# 1\. Clonar el repositorio: `git clone https://github.com/robinszuniga/SolarHub.git`

# 2\. Abrir en Android Studio

# 3\. Ejecutar en emulador API 26+

