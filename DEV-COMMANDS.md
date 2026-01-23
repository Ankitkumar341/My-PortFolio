# Development Commands

## Prerequisites
- Node.js >= 18
- pnpm >= 9.0.0
- Java 17+
- Maven

## Install Dependencies
```bash
pnpm install
```

## Development Servers

### Start All Apps
```bash
pnpm run dev
```

### Individual Apps

#### Portfolio (Next.js)
```bash
cd apps/portfolio
pnpm dev
```
**URL:** http://localhost:3000

#### Admin Panel (Angular)
```bash
cd apps/admin
pnpm run dev
```
**URL:** http://localhost:4200

#### Backend (Spring Boot)
```bash
cd apps/backend
./mvnw spring-boot:run
```
**URL:** http://localhost:8080

## Build Commands

### Build All
```bash
pnpm run build
```

### Individual Builds
```bash
# Portfolio
cd apps/portfolio && pnpm build

# Admin
cd apps/admin && pnpm build

# Backend
cd apps/backend && ./mvnw clean package
```

## Other Commands

### Lint
```bash
pnpm run lint
```

### Type Check
```bash
pnpm run check-types
```

### Clean Build Artifacts
```bash
pnpm run clean
```

## Port Configuration
- **Portfolio:** 3000
- **Admin:** 4200
- **Backend:** 8080

## Notes
- Uses Turborepo for monorepo management
- UI mode set to `stream` for PowerShell compatibility
- All apps run in parallel with `pnpm run dev`
